package com.rosan.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	@Autowired // comes through AutoConfiguration
	private DiscoveryClient client; // client component

	public String getBillingInfo() {
		// find and get ServiceInstances of Producer by using Service Id
		List<ServiceInstance> listSI = client.getInstances("Billing-Service"); // should give Producer service id
		// use first ServiceInstance from the List of Instances
		ServiceInstance si = listSI.get(0);
		// get Producer MS URI and make it as URL
		String url = si.getUri() + "/billing/info";
		// create RestTemplateObject
		RestTemplate template = new RestTemplate();
		// invoke Producer MS service method or operation by generating Http call
		String response = template.getForObject(url, String.class);
		return response;
	} // end of method
} // end of class
