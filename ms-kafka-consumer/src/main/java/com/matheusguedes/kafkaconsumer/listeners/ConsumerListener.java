package com.matheusguedes.kafkaconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class ConsumerListener {

    @KafkaListener(groupId = "group-1", topics = { "main-topic" }, containerFactory = "containerFactory")
    public void listener(String message){
        log.info("Nova mensagem rececbida: \n{}", message);
    }

}