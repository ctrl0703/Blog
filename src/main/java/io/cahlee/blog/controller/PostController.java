package io.cahlee.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.cahlee.blog.domain.Post;
import io.cahlee.blog.service.PostService;

@RestController
public class PostController {
	@Autowired
	PostService postService;
	
	@PostMapping("/post")
	public Long savePost(Post post) {
		return postService.save(post);
	}
	
	@GetMapping("/post")
	public List<Post> getPosts() {
		return postService.getPosts();
	}
}
