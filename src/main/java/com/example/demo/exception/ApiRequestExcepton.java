package com.example.demo.exception;

public class ApiRequestExcepton extends RuntimeException {

    public ApiRequestExcepton(String message) {
        super(message);
    }

    public ApiRequestExcepton(String message, Throwable cause) {
        super(message, cause);
    }
}
