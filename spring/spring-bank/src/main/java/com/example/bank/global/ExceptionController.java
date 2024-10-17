package com.example.bank.global;

import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ExceptionController {
    @ExceptionHandler(RuntimeException.class)
    public String runtimeException(RuntimeException e) {
        return e.getMessage();
    }

}
