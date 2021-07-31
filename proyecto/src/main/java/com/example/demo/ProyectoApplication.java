package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@SpringBootApplication
@RestController
@EnableJpaRepositories
public class ProyectoApplication {

	@Bean
    public RestTemplate getresttemplate() {
        return new RestTemplate();
    }
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
