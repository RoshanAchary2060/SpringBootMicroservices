package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj01SearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj01SearchServiceApplication.class, args);
	}

}
