package diegofred.digital.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import diegofred.digital.models.Post;
import diegofred.digital.models.User;
import diegofred.digital.repositories.UserRepository;
import diegofred.digital.services.PostService;
import diegofred.digital.services.StorageService;
import diegofred.digital.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("media")
@AllArgsConstructor
public class MediaController {
    @Autowired
    private final StorageService storageService;
    private final HttpServletRequest request;
    private final UserRepository userRepository;
    private final UserService userService;
    private final PostService postService;


@PostMapping("upload")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multiparFile, User user) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        user = userRepository.findByUsername(currentUserName)
                .orElseThrow(() -> new RuntimeException("User not found with username " + currentUserName));

                user.setImage(multiparFile.getOriginalFilename());
                userService.save(user);

        String path = storageService.store(multiparFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();

        return Map.of("url", url);
    }

    @GetMapping("{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.loadAsResource(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());

        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }
    @PostMapping("upload/post")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multipartFile, Post post) {
        // String url = "";
        // if (multipartFile != null) {
            post.setImage(multipartFile.getOriginalFilename());
            postService.save(post);
    
            String path = storageService.store(multipartFile);
            String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
            String url = ServletUriComponentsBuilder
                    .fromHttpUrl(host)
                    .path("/media/")
                    .path(path)
                    .toUriString();


// else {
//             postService.save(post);
//         }
    
        return Map.of("url", url);
    }
}