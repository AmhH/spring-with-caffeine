package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringWithCaffeineApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(SpringWithCaffeineApplication.class).run(args);
		SpringApplication.run(SpringWithCaffeineApplication.class, args);
	}

}
