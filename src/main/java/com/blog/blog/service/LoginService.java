package com.blog.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blog.domain.User;
import com.blog.blog.repository.UserRepository;

@Service
public class LoginService {

	private UserRepository userRepository;
	

	@Autowired
	public LoginService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	public void initUser() {
		User user = new User("TestUser", "12345");
		userRepository.save(user);
	}
	

	public Boolean login(String username, String password) {
		if (username == "TestUser" && password == "TestPassword") {
			return true;
		} else {
			return false;
		}
	}
}
