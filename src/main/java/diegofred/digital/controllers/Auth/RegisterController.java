package diegofred.digital.controllers.Auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import diegofred.digital.models.User;
import diegofred.digital.services.UserService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class RegisterController {
    private UserService userService;

    

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            userService.store(user);
            return ResponseEntity.status(201).body("User created successfully");
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
    

    
    

