package com.blog.blog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog.domain.Blog;

public interface BlogRepository extends CrudRepository<Blog, Long> {

	List<Blog> findAll();
	
	Blog findById(Long id);
}
