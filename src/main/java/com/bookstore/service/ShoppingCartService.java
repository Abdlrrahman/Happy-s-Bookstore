package com.bookstore.service;

import com.bookstore.domain.ShoppingCart;

import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {

    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

}