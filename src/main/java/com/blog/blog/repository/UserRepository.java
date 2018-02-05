package com.blog.blog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	List<User> findAll();
}
