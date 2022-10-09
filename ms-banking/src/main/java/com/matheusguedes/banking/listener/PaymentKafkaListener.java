package com.matheusguedes.banking.listener;

import com.matheusguedes.banking.domain.entity.Payment;
import com.matheusguedes.banking.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@RequiredArgsConstructor
public class PaymentKafkaListener {

    private final PaymentService paymentService;

    @KafkaListener(topics = { "payment-topic" }, groupId = "main-group", containerFactory = "jsonContainerFactory")
    public void listener(@Payload Payment payment){
        log.info("New payment: {}", payment);
        paymentService.save(payment);
    }

}