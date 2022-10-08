package com.matheusguedes.kafkaconsumer.listeners;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ConsumerListener {

    @CustomConsumerListener(groupId = "group-1")
    public void listenerOneGroupOne(String message) throws IllegalArgumentException {
        log.info("listenerOneGroupOne ::: Nova mensagem rececbida: {}", message);
    }

    @CustomConsumerListener(groupId = "group-2")
    public void listenerOneGroupTwo(String message){
        log.info("listenerOneGroupTwo ::: Nova mensagem rececbida: {}", message);
    }

    @KafkaListener(topics = { "main-topic" }, groupId = "group-3", containerFactory = "validMessageContainerFactory", errorHandler = "errorCustomExceptionHandler")
    public void listenerComValidacao(String message){
        log.info("listenerComValidacao ::: Nova mensagem rececbida: {}", message);
    }

}