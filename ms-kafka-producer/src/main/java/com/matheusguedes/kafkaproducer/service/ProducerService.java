package com.matheusguedes.kafkaproducer.service;

import com.matheusguedes.kafkaproducer.enums.KafkaTopicEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        kafkaTemplate.send(KafkaTopicEnum.MAIN_TOPIC.getName(), message).addCallback(
                success -> {
                    if(success != null){
                        log.info("Mensagem enviada: (Partition: {} | Offset: {})\n{}", success.getRecordMetadata().partition(), success.getRecordMetadata().offset(), message);
                    }
                },
                error -> log.error("Erro ao enviar mensagem: {}", message)
        );
    }
}