package com.matheusguedes.payment.service.implementation;

import com.matheusguedes.payment.domain.entity.Payment;
import com.matheusguedes.payment.domain.repository.PaymentRepository;
import com.matheusguedes.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    private final PaymentRepository paymentRepository;

    @Override
    public void sendPayment(Payment payment) {
        paymentRepository.save(payment);
        log.info("New payment: {}", payment);
        kafkaTemplate.send("payment-topic", payment);
    }

}