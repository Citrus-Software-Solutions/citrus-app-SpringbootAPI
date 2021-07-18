package com.example.demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.RabbitMQ.RabbitMqConfig;
 
@SpringBootApplication
public class TutorialRabbitmqSpringApplication implements CommandLineRunner {
	
	private static final String MESSAGE = "Hello world!";
	 
    @Autowired
    RabbitTemplate rabbitTemplate;
 
    public static void main(String[] args) {
        SpringApplication.run(TutorialRabbitmqSpringApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws InterruptedException {
        System.out.println("[Application] Enviando el mensaje \"" + MESSAGE + "\"...");
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, MESSAGE);
    }

}
