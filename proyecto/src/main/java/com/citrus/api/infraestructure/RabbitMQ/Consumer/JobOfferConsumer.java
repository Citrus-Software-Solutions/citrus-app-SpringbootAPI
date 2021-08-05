package com.citrus.api.infraestructure.RabbitMQ.Consumer;

import com.citrus.api.infraestructure.RabbitMQ.RabbitMQConfig;
import com.citrus.api.infraestructure.api.DTO.JobOfferDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class JobOfferConsumer {

	 @RabbitListener(queues = RabbitMQConfig.QUEUE2)
	    public void consumeMessageFromQueue(JobOfferDTO joboffer) throws JsonProcessingException {
	        System.out.println("Message recieved from queue : " + joboffer);
	        
	    	ObjectMapper mapper = new ObjectMapper();
	  	  
	    	String json = mapper.writerWithDefaultPrettyPrinter()
	    	                    .writeValueAsString(joboffer);
	    	
	    	System.out.println("Message recieved from queue : " + json);
	    }
}
