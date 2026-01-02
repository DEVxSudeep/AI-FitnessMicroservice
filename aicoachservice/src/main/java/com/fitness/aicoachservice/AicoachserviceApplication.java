package com.fitness.aicoachservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class AicoachserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AicoachserviceApplication.class, args);
	}

}
