package com.matheusguedes.banking.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "banking_payments")
public class Payment implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String paymentHash;

    @Column
    private String userHash;

    @Column
    private String productHash;

    @Column
    private BigDecimal totalValue;

    @Column(length = 16)
    private String cardNumber;

}