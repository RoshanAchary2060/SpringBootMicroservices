package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringBootMsProj09HystrixCircuitBreakerHystrixPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj09HystrixCircuitBreakerHystrixPropertiesApplication.class, args);
	}

}
