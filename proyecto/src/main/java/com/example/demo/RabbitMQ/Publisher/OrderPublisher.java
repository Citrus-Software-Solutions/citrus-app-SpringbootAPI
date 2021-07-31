package com.example.demo.RabbitMQ.Publisher;

import com.example.demo.RabbitMQ.RabbitMqConfig;
import com.example.demo.RabbitMQ.Dto.Prueba;
import com.example.demo.RabbitMQ.Dto.Prueba3;
import com.example.demo.RabbitMQ.Dto.data;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.infraestructure.api.DTO.LocationDTO;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public String PruebaRabbitMQ(@RequestBody Prueba3 prueba4) {
    	//Prueba3 Prueba_2 = new Prueba3("employers_list", prueba4);
        template.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.ROUTING_KEY, prueba4);
        return "Success !!";
    }
}
