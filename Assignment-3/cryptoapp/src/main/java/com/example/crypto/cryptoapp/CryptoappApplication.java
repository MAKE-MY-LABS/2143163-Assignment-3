package com.example.crypto.cryptoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CryptoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoappApplication.class, args);
	}

	// add bean config for allow all origins
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// append all methods to the registry
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}

}
