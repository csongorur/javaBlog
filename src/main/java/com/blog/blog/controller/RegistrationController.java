package com.blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.blog.domain.User;
import com.blog.blog.service.UserService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	private UserService userService;

	@Autowired
	public RegistrationController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("show")
	public String create(Model model) {
		model.addAttribute("user", new User());
		return "pages/registration";
	}
	
	@PostMapping("store")
	public String store(@ModelAttribute User user) {
		this.userService.create(user);
		return "pages/blogs/index";
	}
	
}
