package com.example.hotel_springboot_backend.repositories;

import com.example.hotel_springboot_backend.entities.BookingReference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingReferenceRepository extends JpaRepository<BookingReference, Long> {

    Optional<BookingReference> findByReferenceNo(String referenceNo);
}

