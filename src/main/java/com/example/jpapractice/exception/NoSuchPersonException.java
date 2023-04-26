package com.example.jpapractice.exception;

public class NoSuchPersonException extends RuntimeException {
    public NoSuchPersonException(String message) {
        super(message);
    }
}
