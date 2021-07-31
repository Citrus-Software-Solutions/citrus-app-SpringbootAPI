package com.example.demo.RabbitMQ.Consumer;

import com.example.demo.RabbitMQ.RabbitMqConfig;
import com.example.demo.RabbitMQ.Dto.OrderStatus;
import com.example.demo.RabbitMQ.Dto.Prueba;
import com.example.demo.RabbitMQ.Dto.data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

/*	 @RabbitListener(queues = RabbitMqConfig.QUEUE)
	    public void consumeMessageFromQueue(Prueba orderStatus) throws JsonProcessingException {
	        System.out.println("Message recieved from queue : " + orderStatus);
	        
	    	ObjectMapper mapper = new ObjectMapper();
	  	  
	    	String json = mapper.writerWithDefaultPrettyPrinter()
	    	                    .writeValueAsString(orderStatus);
	    	
	    	System.out.println("Message recieved from queue : " + json);
	    }*/
}
