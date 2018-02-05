package com.blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blog.blog.service.BlogService;

@Controller
public class BlogController {
	
	private BlogService blogService;
	
	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}



	@GetMapping("/blogs")
	public String getBlogs(Model model) {
		model.addAttribute("blogs", this.blogService.getBlogs());
		return "pages/blogs/index";
	}
	
	@GetMapping("/blogs/create")
	public String createBlog() {
		return "pages/blogs/create";
	}
}
