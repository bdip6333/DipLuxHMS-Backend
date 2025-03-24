package com.example.hotel_springboot_backend.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message)
    {
        super(message);
    }
}
