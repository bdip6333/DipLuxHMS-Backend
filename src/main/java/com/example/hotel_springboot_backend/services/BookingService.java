package com.example.hotel_springboot_backend.services;

import com.example.hotel_springboot_backend.dtos.BookingDTO;
import com.example.hotel_springboot_backend.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
