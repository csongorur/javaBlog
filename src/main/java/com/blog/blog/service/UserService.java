package com.blog.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog.domain.User;
import com.blog.blog.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User create(User user) {
		return userRepository.save(user);
	}
	
}
