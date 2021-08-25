package com.upgrad.bookingservice.dao;

import com.upgrad.bookingservice.entities.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDAO extends JpaRepository<BookingInfoEntity,Integer> {
}
