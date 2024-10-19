package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootMsProj12MiniProjectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj12MiniProjectConfigServerApplication.class, args);
	}

}
