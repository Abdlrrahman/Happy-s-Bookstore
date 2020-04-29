package com.bookstore.service;

import com.bookstore.domain.UserPayment;

import org.springframework.stereotype.Service;

@Service
public interface UserPaymentService {

    UserPayment findById(Long id);

    void removeById(Long id);

}
