package com.axis.cibil.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse {
    private String errorCode;
    private String message;

    public ErrorResponse(String errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
