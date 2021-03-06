package com.citrus.api.infraestructure.RabbitMQ;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	public static final String QUEUE = "test_queue";
	public static final String QUEUE2 = "Interview_queue";
    public static final String EXCHANGE = "javatechie_exchange";
    public static final String ROUTING_KEY = "javatechie_routingKey";
    private static final boolean IS_DURABLE_QUEUE = false;

    @Bean
    public Queue queue() {
        return new Queue(QUEUE, IS_DURABLE_QUEUE);
    }
    
    @Bean
    public Queue queue2() {
        return new Queue(QUEUE, IS_DURABLE_QUEUE);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    public MessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}
