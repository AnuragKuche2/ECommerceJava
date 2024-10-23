package com.javaProject.dreamshops.service.cart;

import com.javaProject.dreamshops.model.Cart;
import com.javaProject.dreamshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}