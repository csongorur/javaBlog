package com.blog.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog.domain.Blog;
import com.blog.blog.repository.BlogRepository;

@Service
public class BlogService {

	private BlogRepository blogRepository;

	@Autowired
	public BlogService(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}
	
	public List<Blog> getBlogs() {
		return this.blogRepository.findAll();
	}
	
	public Blog getSepecifiedBlog(Long id) {
		return this.blogRepository.findById(id);
	}
}
