package com.rosan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosan.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shop")
public class ShoppingController {
	@Autowired
	private IBillingServiceRestConsumer consumer;

	@GetMapping("/info")
	public String displayShoppingDetails() {
		return "Pongal Shopping for Family ..." + consumer.fetchBillDetails();
	} // end of method
} // end of class
