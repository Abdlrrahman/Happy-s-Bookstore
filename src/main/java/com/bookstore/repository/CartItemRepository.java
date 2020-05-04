package com.bookstore.repository;

import java.util.List;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

}