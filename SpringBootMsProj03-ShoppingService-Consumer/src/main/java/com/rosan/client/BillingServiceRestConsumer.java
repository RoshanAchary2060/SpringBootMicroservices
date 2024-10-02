package com.rosan.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	@Autowired
	private LoadBalancerClient client;

	public String getBillingInfo() {
		// get less loadFactor service instance
		ServiceInstance si = client.choose("Billing-Service"); // should give Producer service id
		// get Producer MS URI and make it as URL
		String url = si.getUri() + "/billing/info";
		// create RestTemplateObject
		RestTemplate template = new RestTemplate();
		// invoke Producer MS service method or operation by generating Http call
		String response = template.getForObject(url, String.class);
		return response;
	} // end of method
} // end of class
