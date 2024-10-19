package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class BootJmsProj2PublisherAppPubSubApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj2PublisherAppPubSubApplication.class, args);
	}

}
