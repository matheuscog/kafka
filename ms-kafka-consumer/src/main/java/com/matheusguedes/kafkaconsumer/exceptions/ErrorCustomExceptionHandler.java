package com.matheusguedes.kafkaconsumer.exceptions;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ErrorCustomExceptionHandler implements KafkaListenerErrorHandler {

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
        log.info("ERRO -> {}", e.toString());
        log.info("MSG_HEADERS -> {}", message.getHeaders());
        log.info("MSG_PAYLOAD -> {}", message.getPayload());
        return null;
    }

}