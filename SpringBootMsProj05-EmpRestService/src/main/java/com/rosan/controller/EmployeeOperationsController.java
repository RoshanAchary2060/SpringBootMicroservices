package com.rosan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
@RefreshScope
public class EmployeeOperationsController {

	@Value("${dbuser}")
	private String user;
	@Value("${dbpassword}")
	private String password;

	@GetMapping("/show")
	public String showData() {
		return "(Employee) Data collected through Config Server :: " + user + "---" + password;
	}
}
