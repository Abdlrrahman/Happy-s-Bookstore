package com.bookstore.service.impl;

import com.bookstore.service.UserPaymentService;

import org.springframework.beans.factory.annotation.Autowired;

public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    public UserPayment findById(Long id) {
        return userPaymentRepository.findOne(id);
    }
}
