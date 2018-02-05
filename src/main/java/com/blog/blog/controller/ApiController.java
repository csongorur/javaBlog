package com.blog.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog.domain.Blog;
import com.blog.blog.service.BlogService;

@RestController
public class ApiController {
	
	private BlogService blogService;
	
	@Autowired
	public ApiController(BlogService blogService) {
		this.blogService = blogService;
	}



	@GetMapping("api/blogs")
	public List<Blog> getBlogs() {
		return this.blogService.getBlogs();
	}
}
