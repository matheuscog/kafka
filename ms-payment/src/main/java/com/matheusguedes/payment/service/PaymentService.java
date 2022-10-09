package com.matheusguedes.payment.service;

import com.matheusguedes.payment.domain.entity.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);

}