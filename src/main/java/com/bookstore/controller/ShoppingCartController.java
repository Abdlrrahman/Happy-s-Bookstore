package com.bookstore.controller;

import java.security.Principal;
import java.util.List;

import com.bookstore.domain.Book;
import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.User;
import com.bookstore.service.BookService;
import com.bookstore.service.CartItemService;
import com.bookstore.service.ShoppingCartService;
import com.bookstore.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private BookService bookService;

    @RequestMapping("/cart")
    public String shoppingCart(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        ShoppingCart shoppingCart = user.getShoppingCart();

        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

        shoppingCartService.updateShoppingCart(shoppingCart);

        model.addAttribute("cartItemList", cartItemList);
        model.addAttribute("shoppingCart", shoppingCart);

        return "shoppingCart";
    }

    @RequestMapping("/addItem")
    public String addItem(@ModelAttribute("book") Book book, @ModelAttribute("qty") String qty, Model model,
            Principal principal) {
        User user = userService.findByUsername(principal.getName());
        book = bookService.findById(book.getId());

        if (Integer.parseInt(qty) > book.getInStockNumber()) {
            model.addAttribute("notEnoughStock", true);
            return "forward:/bookDetail?id=" + book.getId();
        }

        CartItem cartItem = cartItemService.addBookToCartItem(book, user, Integer.parseInt(qty));
        model.addAttribute("addBookSuccess", true);

        return "forward:/bookDetail?id=" + book.getId();
    }

}