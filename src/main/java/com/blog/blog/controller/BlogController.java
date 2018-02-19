package com.blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.blog.domain.Blog;
import com.blog.blog.service.BlogService;


@Controller
@RequestMapping("blog")
public class BlogController {
	
	private BlogService blogService;
	
	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}



	@GetMapping("blogs")
	public String getBlogs(Model model) {
		model.addAttribute("blogs", this.blogService.getBlogs());
		return "pages/blogs/index";
	}
	
	@GetMapping("create")
	public String createBlog(Model model) {
		model.addAttribute("blog", new Blog());
		return "pages/blogs/create";
	}
	
	@PostMapping("store")
	public String store(@ModelAttribute Blog blog) {
		this.blogService.store(blog);
		return "redirect:/blog/blogs";
	}
	
	@GetMapping("{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("blog", this.blogService.getSepecifiedBlog(id));
		
		return "pages/blogs/edit";
	}
	
	@PostMapping("update")
	public String update(@ModelAttribute Blog blog) {
		this.blogService.update(blog);
		
		return "redirect:/blog/blogs";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable Long id) {
		this.blogService.delete(id);
		
		return "redirect:/blog/blogs";
	}
	
	@GetMapping("test")
	public String test() {
		return "pages/blogs/edit";
	}
}
