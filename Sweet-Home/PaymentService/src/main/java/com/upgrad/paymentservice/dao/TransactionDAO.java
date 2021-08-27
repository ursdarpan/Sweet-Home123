package com.upgrad.paymentservice.dao;

import com.upgrad.paymentservice.entities.TransactionDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDAO extends JpaRepository<TransactionDetailsEntity,Integer> {
}
