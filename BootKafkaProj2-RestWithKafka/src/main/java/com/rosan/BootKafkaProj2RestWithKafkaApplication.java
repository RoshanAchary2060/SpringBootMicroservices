package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootKafkaProj2RestWithKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootKafkaProj2RestWithKafkaApplication.class, args);
	}

}
