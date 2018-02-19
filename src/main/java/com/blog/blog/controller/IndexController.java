package com.blog.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.blog.blog.service.LoginService;

@Controller
public class IndexController {

	LoginService loginService;

	@Autowired
	public IndexController(LoginService loginService) {
		this.loginService = loginService;
	}



	@GetMapping("/")
	public String index()
	{
		return "pages/index";
	}
}
