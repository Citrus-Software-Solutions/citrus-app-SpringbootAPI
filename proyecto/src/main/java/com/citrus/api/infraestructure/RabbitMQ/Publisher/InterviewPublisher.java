package com.citrus.api.infraestructure.RabbitMQ.Publisher;


import com.citrus.api.infraestructure.RabbitMQConfig.RabbitMqConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.citrus.api.infraestructure.api.DTO.InterviewDTO;

@RestController
@RequestMapping("/interview")
public class InterviewPublisher {

	@Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public String PruebaRabbitMQ(@RequestBody InterviewDTO interview) {
        template.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.ROUTING_KEY, interview);
        return "Success !!";
    }
}
