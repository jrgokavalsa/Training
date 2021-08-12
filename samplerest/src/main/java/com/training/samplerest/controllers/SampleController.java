package com.training.samplerest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	
	@GetMapping("welcome")
	public String welcome() {
		return "Welcome to spring boot Training";
	}
	
	@GetMapping("course")
	public String Course() {
		return "Spring Boot Course";
	}
	
	@GetMapping("user")
	public String User() {
		return "Users Attending Spring Session";
	}
}

