package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj03ShoppingServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj03ShoppingServiceConsumerApplication.class, args);
	}

}
