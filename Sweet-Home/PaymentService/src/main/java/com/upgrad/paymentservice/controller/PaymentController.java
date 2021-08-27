package com.upgrad.paymentservice.controller;

import com.upgrad.paymentservice.dto.TransactionDetailsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payment")
public class PaymentController {
    @PostMapping(value="/transaction")
    public ResponseEntity createPaymentTransaction(@RequestBody TransactionDetailsDTO transactionDetailsDTO){
        return null;
    }
}
