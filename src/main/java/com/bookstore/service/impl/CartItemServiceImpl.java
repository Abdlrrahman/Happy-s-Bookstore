package com.bookstore.service.impl;

import com.bookstore.service.CartItemService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }
}