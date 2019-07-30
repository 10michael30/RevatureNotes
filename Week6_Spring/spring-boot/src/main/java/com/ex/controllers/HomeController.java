package com.ex.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping("/home")
	public String welcome() {
		return "Welcome To Spring Boot";
	}

}