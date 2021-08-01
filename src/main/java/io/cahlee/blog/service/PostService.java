package io.cahlee.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cahlee.blog.domain.Post;
import io.cahlee.blog.persistence.PostRepository;

@Service
public class PostService {
	@Autowired
	PostRepository postRepository;

	public Long save(Post post) {
		return postRepository.save(post).getId();
	}

	public List<Post> getPosts() {
		return postRepository.findAll();
	}

	public Post getPost(Long id) {
		return postRepository.getById(id);
	}
	
}
