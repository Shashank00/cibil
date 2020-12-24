package com.axis.cibil.exception;

public class CibilException extends Throwable {
    public String message;


    public CibilException(String message, String errorMessage) {
        super(message);
        this.message = errorMessage;
    }
}
