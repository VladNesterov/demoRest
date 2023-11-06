package com.rest.demoRest.service;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}