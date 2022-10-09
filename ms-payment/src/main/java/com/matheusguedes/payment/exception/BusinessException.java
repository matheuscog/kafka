package com.matheusguedes.payment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BusinessException extends ResponseStatusException {

    // To general purposes
    public BusinessException(HttpStatus responseCode, String message){
        super(responseCode, message);
    }

}