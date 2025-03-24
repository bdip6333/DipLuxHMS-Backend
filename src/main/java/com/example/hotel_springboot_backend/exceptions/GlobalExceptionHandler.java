package com.example.hotel_springboot_backend.exceptions;

import com.example.hotel_springboot_backend.dtos.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> handleAllUnknowExceptions(Exception ex) {
        Response response = Response.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(com.example.hotel_springboot_backend.exceptions.NotFoundException.class)
    public ResponseEntity<Response> handleNotFoundException(com.example.hotel_springboot_backend.exceptions.NotFoundException ex) {
        Response response = Response.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(com.example.hotel_springboot_backend.exceptions.NameValueRequiredException.class)
    public ResponseEntity<Response> handleNameValueRequiredException(com.example.hotel_springboot_backend.exceptions.NameValueRequiredException ex) {
        Response response = Response.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(com.example.hotel_springboot_backend.exceptions.InvalidCredentialException.class)
    public ResponseEntity<Response> handleInvalidCredentialException(com.example.hotel_springboot_backend.exceptions.InvalidCredentialException ex) {
        Response response = Response.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(com.example.hotel_springboot_backend.exceptions.InvalidBookingStateAndDateException.class)
    public ResponseEntity<Response> handleInvalidBookingStateAndDateException(com.example.hotel_springboot_backend.exceptions.InvalidBookingStateAndDateException ex) {
        Response response = Response.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
