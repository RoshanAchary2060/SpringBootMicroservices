package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootMsProj12MiniProjectAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj12MiniProjectAdminServerApplication.class, args);
	}

}
