package com.matheusguedes.kafkaproducer.service;

import com.matheusguedes.kafkaproducer.enums.KafkaTopicEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        kafkaTemplate.send(
                KafkaTopicEnum.MAIN_TOPIC.getName(),
                message
        );
    }
}
