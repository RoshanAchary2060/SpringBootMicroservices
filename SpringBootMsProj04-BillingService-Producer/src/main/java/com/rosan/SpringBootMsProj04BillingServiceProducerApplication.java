package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj04BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj04BillingServiceProducerApplication.class, args);
	}

}
