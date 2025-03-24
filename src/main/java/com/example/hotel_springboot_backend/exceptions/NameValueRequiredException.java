package com.example.hotel_springboot_backend.exceptions;

public class NameValueRequiredException extends RuntimeException {
    public NameValueRequiredException(String message)
    {
        super(message);
    }
}
