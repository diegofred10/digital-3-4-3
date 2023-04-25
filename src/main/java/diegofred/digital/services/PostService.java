package diegofred.digital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import diegofred.digital.models.Post;
import diegofred.digital.repositories.PostRepository;

@Service
public class PostService {

    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
    

