package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class SpringBootMsProj10HystrixCircuitBreakerHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj10HystrixCircuitBreakerHystrixDashboardApplication.class, args);
	}

}
