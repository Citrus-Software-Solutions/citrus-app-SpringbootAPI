package com.citrus.api.infraestructure.RabbitMQ.Publisher;

import com.citrus.api.infraestructure.RabbitMQ.RabbitMQConfig;
import com.citrus.api.infraestructure.RabbitMQ.Dto.ApplicationMessage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citrus.api.infraestructure.api.DTO.ApplicationDTO;

@Service
public class InterviewPublisher {

	@Autowired
    private RabbitTemplate template;

    public String PruebaRabbitMQ(ApplicationDTO application) {
    	List<ApplicationDTO> lista = new ArrayList<ApplicationDTO>();
    	lista.add(application);
    	ApplicationMessage applicationpublish = new ApplicationMessage("Application", lista);
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, applicationpublish);
        return "Success !!";
    }
	
}
