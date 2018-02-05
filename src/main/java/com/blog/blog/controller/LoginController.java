package com.blog.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@PostMapping("/login/login")
	public String login()
	{
		return "index";
	}
}
