package com.javaProject.dreamshops.dto;

import com.javaProject.dreamshops.model.Cart;
import com.javaProject.dreamshops.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}