package io.cahlee.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.cahlee.blog.service.PostService;

@Controller
public class PageController {
	@Autowired
	PostService postService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/note/{id}")
	public String note(@PathVariable Long id, Model model) {
		model.addAttribute("post", postService.getPost(id));
		return "note";
	}
	
	@GetMapping("/note")
	public String notes(Model model) {
		model.addAttribute("posts", postService.getPosts());
		return "note";
	}
	
	@GetMapping("/project")
	public String project() {
		return "project";
	}
	
	@GetMapping("/work")
	public String work() {
		return "work";
	}
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
}
