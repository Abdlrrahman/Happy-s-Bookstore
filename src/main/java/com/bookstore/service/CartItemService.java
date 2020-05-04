package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

import org.springframework.stereotype.Service;

@Service
public interface CartItemService {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

}