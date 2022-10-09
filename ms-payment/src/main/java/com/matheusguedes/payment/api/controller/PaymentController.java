package com.matheusguedes.payment.api.controller;

import com.matheusguedes.payment.api.ResponseMessages;
import com.matheusguedes.payment.domain.entity.Payment;
import com.matheusguedes.payment.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Log4j2
@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
@Api(description = "This tab includes all the operations to be performed on a payment.", tags = "Payments")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ApiOperation("Create a new payment.")
    @ApiResponses({
            @ApiResponse(code = 202, message = ""),
            @ApiResponse(code = 400, message = ResponseMessages.YOU_MUST_SEND_A_VALID_PAYMENT),
            @ApiResponse(code = 400, message = ResponseMessages.YOU_MUST_ENTER_USER_HASH),
            @ApiResponse(code = 400, message = ResponseMessages.YOU_MUST_ENTER_PRODUCT_IDENTIFIER),
            @ApiResponse(code = 400, message = ResponseMessages.YOU_MUST_ENTER_CARD_NUMBER)
    })
    public void createPayment(@RequestBody @Valid Payment payment) {
        paymentService.sendPayment(payment);
    }

}