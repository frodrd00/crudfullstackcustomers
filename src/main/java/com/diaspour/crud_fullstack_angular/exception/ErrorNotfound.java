package com.diaspour.crud_fullstack_angular.exception;

import java.time.LocalDateTime;

public class ErrorNotfound {

    private final LocalDateTime time;
    private final String message;
    private final String description;
    private final String errorCode;

    public ErrorNotfound(String message, LocalDateTime time, String description, String errorCode) {
        this.time = time;
        this.message = message;
        this.description = description;
        this.errorCode = errorCode;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
