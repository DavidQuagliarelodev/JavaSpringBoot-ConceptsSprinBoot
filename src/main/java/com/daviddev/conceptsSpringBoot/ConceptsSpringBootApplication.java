package com.daviddev.conceptsSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("dev")
public class ConceptsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConceptsSpringBootApplication.class, args);
	}

}
