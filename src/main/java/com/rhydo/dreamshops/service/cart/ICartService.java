package com.rhydo.dreamshops.service.cart;

import com.rhydo.dreamshops.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart getCartByUserId(Long userId);
}
