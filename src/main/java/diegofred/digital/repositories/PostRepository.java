package diegofred.digital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import diegofred.digital.models.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
