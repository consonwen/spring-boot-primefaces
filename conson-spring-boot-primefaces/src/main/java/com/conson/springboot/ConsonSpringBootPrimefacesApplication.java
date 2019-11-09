package com.conson.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.conson.view", "com.conson.config"})
@EnableJpaRepositories("com.conson.dao")
@EntityScan("com.conson.entity")
public class ConsonSpringBootPrimefacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsonSpringBootPrimefacesApplication.class, args);
	}

}
