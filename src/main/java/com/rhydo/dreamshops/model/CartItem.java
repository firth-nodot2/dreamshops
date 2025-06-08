package com.rhydo.dreamshops.model;

import java.math.BigDecimal;
import java.util.Set;

public class CartItem {
    private Long id;
    private BigDecimal totalAmount;
    private Set<CartItem> cartItems;

}
