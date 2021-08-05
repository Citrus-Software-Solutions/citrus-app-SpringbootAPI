package com.citrus.api.infraestructure.RabbitMQ.Publisher;

import com.citrus.api.infraestructure.RabbitMQ.RabbitMQConfig;
import com.citrus.api.infraestructure.RabbitMQ.DTO.Application;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job-application")
public class JobOfferPublisher {

	@Autowired
    private RabbitTemplate template;

    @PutMapping("/{id}/approve")
    public String PruebaRabbitMQ(@RequestBody Application application, @PathVariable("id") Integer id) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, application);
        return "Success !!";
    }

	
}
