package com.diaspour.crud_fullstack_angular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalHandleException {

    private final WebRequest webRequest;

    public GlobalHandleException(WebRequest webRequest) {
        this.webRequest = webRequest;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorNotfound> handleException(ResourceNotFoundException ex, WebRequest request) {
        ErrorNotfound errorNotfound = new ErrorNotfound(
                ex.getMessage(),
                LocalDateTime.now(),
                request.getDescription(false),
                HttpStatus.NOT_FOUND.toString()
        );
        return new ResponseEntity<>(errorNotfound, HttpStatus.NOT_FOUND);
    }
}
