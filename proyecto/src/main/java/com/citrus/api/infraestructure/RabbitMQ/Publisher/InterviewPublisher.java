package com.citrus.api.infraestructure.RabbitMQ.Publisher;

import com.citrus.api.infraestructure.RabbitMQ.RabbitMQConfig;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;

@Service
public class InterviewPublisher {

	@Autowired
    private RabbitTemplate template;

    public String PruebaRabbitMQ(ApplicationDTO application) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, application);
        return "Success !!";
    }
	
}
