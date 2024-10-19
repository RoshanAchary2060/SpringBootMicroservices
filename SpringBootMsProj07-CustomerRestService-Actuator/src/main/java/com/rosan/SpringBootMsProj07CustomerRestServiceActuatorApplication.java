package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootMsProj07CustomerRestServiceActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj07CustomerRestServiceActuatorApplication.class, args);
	}

}
