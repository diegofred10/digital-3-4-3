package diegofred.digital.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import diegofred.digital.exceptions.PostNotFoundException;
import diegofred.digital.models.Post;
import diegofred.digital.repositories.PostRepository;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class PostService {

    private PostRepository postRepository;


public List<Post>findAll(){
    return postRepository.findAll();
}

public Page<Post> findAll(Pageable pageable) {
    return postRepository.findAll(pageable);
}

public Post findById(Long id) {
    return postRepository.findById(id)
    .orElseThrow(() -> new PostNotFoundException("Post not found with id: " + id));
}

public Post save (Post post) {
    return postRepository.save(post);
}

public void deleteById(Long id) {
    Post postDelete = findById(id);
    postRepository.deleteById(postDelete.getId());
}

public Post updatePost(Long id, Post postDetails){
    Post post = findById(id);
    post.setTitle(postDetails.getTitle());
    post.setDescription(postDetails.getDescription());
    post.setDate(postDetails.getDate());
    post.setImage(postDetails.getImage());
    return save(post);
}





    
}
