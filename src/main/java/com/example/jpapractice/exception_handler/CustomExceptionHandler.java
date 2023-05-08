package com.example.jpapractice.exception_handler;

import com.example.jpapractice.exception.NoSuchPersonException;
import com.example.jpapractice.dao.ExceptionDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {
    @ExceptionHandler(value = NoSuchPersonException.class)
    public ExceptionDTO handleNoSuchCustomerException(NoSuchPersonException noSuchPersonException) {
        log.error("not found exception {}", noSuchPersonException.getMessage());
        return new ExceptionDTO(HttpStatus.NOT_FOUND.value(), noSuchPersonException.getMessage());
    }
}