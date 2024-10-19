package com.rosan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
@RefreshScope
public class CustomerOperationsController {

	@Value("${dbuser}")
	private String user;
	@Value("${dbpassword}")
	private String password;

	@GetMapping("/display")
	public String displayData() {
		return "(Customer) Data collected through Config Server :: " + user + "---" + password;
	}
}
