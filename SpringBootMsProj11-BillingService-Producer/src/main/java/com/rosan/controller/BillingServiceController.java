package com.rosan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingServiceController {

	@Value("${server.port}")
	private int port;

	// injected to know which instance is picked by LoadBalancerClient to consume
	// the Producer service
	@Value("${eureka.instance.instance-id}")
	private String instanceID;

	@GetMapping("/info")
	public String getBillingInfo() {
		return "We accept Card Payment, UPI Payment, NetBanking Payment, COD => port :: " + port + " , instanceId :: "
				+ instanceID;
	}
}
