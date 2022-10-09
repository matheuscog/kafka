package com.matheusguedes.banking.domain.repository;

import com.matheusguedes.banking.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {}