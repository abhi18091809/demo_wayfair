package com.example.demo.service;

import com.example.demo.dtos.CreateOrderRequestDto;
import com.example.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    public Order placeOrder(CreateOrderRequestDto requestDto) {
        System.out.println("items:"+requestDto.getItemIds());
        System.out.println("user:"+requestDto.getUserId());
        return new Order(requestDto.getItemIds(), requestDto.getUserId());
    }
}
