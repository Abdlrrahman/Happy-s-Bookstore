package com.bookstore.service;

import com.bookstore.domain.BillingAddress;
import com.bookstore.domain.Order;
import com.bookstore.domain.Payment;
import com.bookstore.domain.ShippingAddress;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.User;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order createOrder(ShoppingCart shoppingCart, ShippingAddress shippingAddress, BillingAddress billingAddress,
            Payment payment, String shippingMethod, User user);

}