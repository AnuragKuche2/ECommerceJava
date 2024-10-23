package com.javaProject.dreamshops.service.order;

import com.javaProject.dreamshops.dto.OrderDto;
import com.javaProject.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}