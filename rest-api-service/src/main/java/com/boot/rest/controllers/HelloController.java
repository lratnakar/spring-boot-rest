package com.boot.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello(@RequestParam String user) {
		return "Hello Mr. "+user;
	}

	@GetMapping("/welcome")
	public String hello(@RequestParam String user) {
		return "Welcome to Springboot Rest API - Mr. "+user;
	}
}
