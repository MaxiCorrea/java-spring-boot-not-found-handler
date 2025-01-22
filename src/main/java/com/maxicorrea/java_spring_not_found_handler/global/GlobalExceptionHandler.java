package com.maxicorrea.java_spring_not_found_handler.global;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @Value("${spring.application.name}")
    private String appName;

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<NotFound> handleNotFound(NoHandlerFoundException ex) {
        String errorMessage = "Not Found Resource: " + ex.getRequestURL();
        NotFound response = new NotFound(errorMessage, HttpStatus.NOT_FOUND.value(), appName);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
