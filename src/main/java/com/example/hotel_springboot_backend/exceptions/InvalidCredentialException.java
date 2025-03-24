package com.example.hotel_springboot_backend.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException(String message)
    {
        super(message);
    }
}
