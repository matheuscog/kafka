package com.matheusguedes.kafkaconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ConsumerListener {

    @CustomConsumerListener(groupId = "group-1")
    public void listenerOneGroupOne(String message){
        log.info("listenerOneGroupOne ::: Nova mensagem rececbida: \n{}", message);
    }

    @CustomConsumerListener(groupId = "group-1")
    public void listenerTwoGroupOne(String message){
        log.info("listenerTwoGroupOne ::: Nova mensagem rececbida: \n{}", message);
    }

    @CustomConsumerListener(groupId = "group-2")
    public void listenerOneGroupTwo(String message){
        log.info("listenerOneGroupTwo ::: Nova mensagem rececbida: \n{}", message);
    }

    @CustomConsumerListener(groupId = "group-2")
    public void listenerTwoGroupTwo(String message){
        log.info("listenerTwoGroupTwo ::: Nova mensagem rececbida: \n{}", message);
    }

}