package com.example.kiosk.exception.kiosk;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class KioskExceptionController {

    @ExceptionHandler(KioskNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void kioskNotFoundException(KioskNotFoundException e) {
        System.out.println(e.getMessage());
    }
}
