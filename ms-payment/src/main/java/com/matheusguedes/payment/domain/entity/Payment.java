package com.matheusguedes.payment.domain.entity;

import com.matheusguedes.payment.api.ResponseMessages;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name = "payments")
public class Payment implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", updatable = false, nullable = false, unique = true)
    @ColumnDefault("random_uuid()")
    @Type(type = "uuid-char")
    private UUID paymentHash;

    @Column
    @NotEmpty(message = ResponseMessages.YOU_MUST_ENTER_USER_HASH)
    private String userHash;

    @Column
    @NotEmpty(message = ResponseMessages.YOU_MUST_ENTER_PRODUCT_IDENTIFIER)
    private String productHash;

    @Column
    @NotNull(message = ResponseMessages.YOU_MUST_ENTER_VALUE)
    private BigDecimal totalValue;

    @Column(length = 16)
    @NotEmpty(message = ResponseMessages.YOU_MUST_ENTER_CARD_NUMBER)
    private String cardNumber;

}