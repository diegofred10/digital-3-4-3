package diegofred.digital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import diegofred.digital.exceptions.UserNotFoundException;
import diegofred.digital.models.User;
import diegofred.digital.repositories.UserRepository;


@Service
public class UserService {
    
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User>findAll(){
        return userRepository.findAll();
    }

    public Page<User>findall(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    public User findById(Long id){
        return userRepository.findById(id)
        .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    public User save (User user){
    return userRepository.save(user);
    }

    public void deleteById(Long id){
        User userDelete = findById(id);
        userRepository.deleteById(userDelete.getId());
    }

    public User updateUser(Long id, User userDetails){
        User user = findById(id);
        user.setPassword(userDetails.getPassword());
        user.setUsername(userDetails.getUsername());
        user.setRoles(userDetails.getRoles());
        return save(user);

    }

    public User store(User user) {
        Optional<User> userOptional = userRepository.findByUsername(user.getUsername());

        if (userOptional.isPresent()) {
            throw new UserNotFoundException("User already exists with username: " + user.getUsername());
        }

        try {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);
            return userRepository.save(user);
            
        } catch (DataAccessException e) {
            throw new UserNotFoundException("Dont save user: " + user.getUsername());
        }
    }

    @Transactional
    public User findByUsername(String username){
        return userRepository.findByUsername(username)
                        .orElseThrow(() -> new UserNotFoundException("User not found with username: " + username));
}
}
