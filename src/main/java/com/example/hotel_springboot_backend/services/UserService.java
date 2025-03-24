package com.example.hotel_springboot_backend.services;

import com.example.hotel_springboot_backend.dtos.LoginRequest;
import com.example.hotel_springboot_backend.dtos.RegistrationRequest;
import com.example.hotel_springboot_backend.dtos.Response;
import com.example.hotel_springboot_backend.dtos.UserDTO;
import com.example.hotel_springboot_backend.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
