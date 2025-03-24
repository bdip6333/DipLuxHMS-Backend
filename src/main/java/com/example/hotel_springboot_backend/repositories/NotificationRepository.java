package com.example.hotel_springboot_backend.repositories;

import com.example.hotel_springboot_backend.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
