package com.bookstore.service.impl;

import java.math.RoundingMode;

import com.bookstore.service.CartItemService;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.repository.CartItemRepository;

public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
        return cartItemRepository.findByShoppingCart(shoppingCart);
    }

    @Override
    public CartItem updateCartItem(CartItem cartItem) {
        BigDecimal bigDecimal = new BigDecimal(cartItem.getBook().getOurPrice())
                .multiply(new BigDecimal(cartItem.getQty()));

        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        cartItem.setSubtotal(bigDecimal);

        cartItemRepository.save(cartItem);

        return cartItem;

    }
}