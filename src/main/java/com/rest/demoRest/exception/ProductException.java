package com.rest.demoRest.exception;

public class ProductException extends RuntimeException {

    public ProductException(String reason) {
        super(reason);
    }
}
