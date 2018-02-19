package com.blog.blog.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.blog.blog.domain.Blog;
import com.blog.blog.domain.User;
import com.blog.blog.repository.BlogRepository;
import com.blog.blog.repository.UserRepository;

@Service
public class BlogService {

	private BlogRepository blogRepository;
	private UserRepository userRepository;

	@Autowired
	public BlogService(BlogRepository blogRepository, UserRepository userRepository) {
		this.blogRepository = blogRepository;
		this.userRepository = userRepository;
	}
	
	public List<Blog> getBlogs() {
		return this.blogRepository.findAll();
	}
	
	public Blog getSepecifiedBlog(Long id) {
		return this.blogRepository.findById(id);
	}
	
	public Blog store(Blog blog) {
		blog.setPublished(new Date());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		blog.setUser(this.userRepository.findByUsername(auth.getName()));
		
		this.blogRepository.save(blog);
		
		return blog;
	}
	
	public Blog update(Blog blog) {
		blog.setPublished(new Date());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		blog.setUser(this.userRepository.findByUsername(auth.getName()));
		
		this.blogRepository.save(blog);
		
		return blog;
	}

	public void delete(Long id) {
		this.blogRepository.delete(id);
	}
}
