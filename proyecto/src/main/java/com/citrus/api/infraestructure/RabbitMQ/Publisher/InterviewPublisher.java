package com.citrus.api.infraestructure.RabbitMQ.Publisher;

import com.citrus.api.infraestructure.RabbitMQ.RabbitMQConfig;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;

@RestController
@RequestMapping("/job-application")
public class InterviewPublisher {

	@Autowired
    private RabbitTemplate template;

    @PostMapping("/{id}/approve")
    public String PruebaRabbitMQ(@RequestBody ApplicationDTO application) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, application);
        return "Success !!";
    }
	
}
