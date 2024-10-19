package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringBootMsProj08CircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj08CircuitBreakerApplication.class, args);
	}

}
