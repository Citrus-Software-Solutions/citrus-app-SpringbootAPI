package com.example.demo.RabbitMQ;

public class Receiver {
	
    public static final String RECEIVE_METHOD_NAME = "receiveMessage";
    
    public void receiveMessage(String message) {
        System.out.println("[Receiver] ha recibido el mensaje \"" + message + '"');
    }

}
