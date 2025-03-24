package com.example.hotel_springboot_backend.repositories;

import com.example.hotel_springboot_backend.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
