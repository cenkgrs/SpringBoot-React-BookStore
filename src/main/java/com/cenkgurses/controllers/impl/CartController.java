package com.cenkgurses.controllers.impl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenkgurses.entities.Book;
import com.cenkgurses.entities.Cart;
import com.cenkgurses.services.impl.CartServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    private CartServiceImpl cartService;
    
    @PostMapping(path = "/add-item-to-cart")
    public Cart addItemToCart(@RequestBody Book book) {

        return null;
    }

    @GetMapping(path = "/reset-cart")
    public Cart resetCart() {
        return cartService.resetCart();
    }

}
