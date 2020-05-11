package com.bookstore.service;

import com.bookstore.domain.Payment;
import com.bookstore.domain.UserPayment;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    Payment setByUserPayment(UserPayment userPayment, Payment payment);

}