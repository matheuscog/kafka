package com.matheusguedes.banking.service.implementation;

import com.matheusguedes.banking.domain.entity.Payment;
import com.matheusguedes.banking.domain.repository.PaymentRepository;
import com.matheusguedes.banking.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public void save(Payment payment) {
        paymentRepository.save(payment);
        log.info("Payment saved: {}", payment);
    }

}