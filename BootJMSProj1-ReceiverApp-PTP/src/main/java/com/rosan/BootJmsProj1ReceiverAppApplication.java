package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms // optional
public class BootJmsProj1ReceiverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj1ReceiverAppApplication.class, args);
	}

}
