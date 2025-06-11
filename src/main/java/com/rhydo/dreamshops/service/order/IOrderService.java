package com.rhydo.dreamshops.service.order;

import com.rhydo.dreamshops.dto.OrderDto;
import com.rhydo.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);
}
