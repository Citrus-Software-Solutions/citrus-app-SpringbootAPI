package com.citrus.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@SpringBootApplication
@RestController
@EnableJpaRepositories
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
