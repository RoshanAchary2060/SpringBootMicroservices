package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMsProj02BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj02BillingServiceProducerApplication.class, args);
	}

}
