package com.OussamaDev.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler
    public ResponseEntity<BuyerErrorResponse> handleExceptionBuyerNotFound(BuyerNotFoundException exception) {
        BuyerErrorResponse buyerErrorResponse = new BuyerErrorResponse();

        buyerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        buyerErrorResponse.setMessage(exception.getMessage());
        buyerErrorResponse.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(buyerErrorResponse, HttpStatus.NOT_FOUND);
    }
}
