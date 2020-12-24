package com.axis.cibil.exception.handler;

import com.axis.cibil.exception.CibilException;
import com.axis.cibil.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CibilExceptionHandler {

    @ExceptionHandler(CibilException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorResponse genericThrowable(CibilException e) {
        return new ErrorResponse("500", e.message);
    }
}
