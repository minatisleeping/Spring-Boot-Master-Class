package com.example.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler(value = ApiRequestExcepton.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestExcepton e)  {
        ApiException apiException = new ApiException(
            e.getMessage(),
            e,
            HttpStatus.BAD_REQUEST,
            ZonedDateTime.now()

        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleApiRequestException(NotFoundException e)  {
        ApiException apiException = new ApiException(
                e.getMessage(),
                e,
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now()

        );
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }
}
