package com.rosan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
//@ConfigurationProperties(prefix = "info.app")
public class CustomerOperationsController {

	@GetMapping("/display")
	public String displayData() {
		return "Customer info will be displayed here, welcome to Call center";
	}
}
