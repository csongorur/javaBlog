package com.blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.blog.blog.service.UserService;

@Controller
public class RegistrationController {

	private UserService userService;

	@Autowired
	public RegistrationController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("registration")
	public String create() {
		return "pages/registration";
	}
	
}
