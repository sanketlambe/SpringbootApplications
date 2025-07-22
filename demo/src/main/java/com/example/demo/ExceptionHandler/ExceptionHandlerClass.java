package com.example.demo.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.MethodNotAllowedException;

@RestControllerAdvice
public class ExceptionHandlerClass {
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<?> excption(Exception ex)
    {
        return new ResponseEntity<>("Invalid Request", HttpStatus.METHOD_NOT_ALLOWED);

    }
}
