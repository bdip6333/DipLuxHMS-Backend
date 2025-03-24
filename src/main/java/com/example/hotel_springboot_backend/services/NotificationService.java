package com.example.hotel_springboot_backend.services;

import com.example.hotel_springboot_backend.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
