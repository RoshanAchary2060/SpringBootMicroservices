package com.rosan.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeOperationsController {

	@GetMapping("/welcome")
	public String renderWelcomeMessage() {
		return "<h1 style='color:red;text-align:center'>Welcome to Docker Spring Boot Application</h1>";
	}
}
