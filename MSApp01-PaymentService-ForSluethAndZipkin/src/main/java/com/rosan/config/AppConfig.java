package com.rosan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;

@Configuration
public class AppConfig {

	@Bean
	Sampler createSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@Bean
	RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
}
