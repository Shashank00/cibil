package com.axis.cibil.exception.handler;

import reactor.core.publisher.Mono;
import com.axis.cibil.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import com.axis.cibil.exception.CibilException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CibilExceptionHandler {

    @ExceptionHandler(CibilException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Mono<String> genericThrowable(CibilException e) {
        return Mono.just(new ErrorResponse("500", e.message).toString());
    }
}
