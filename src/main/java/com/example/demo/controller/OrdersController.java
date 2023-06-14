package com.example.demo.controller;

import com.example.demo.dtos.CreateOrderRequestDto;
import com.example.demo.entities.Order;
import com.example.demo.service.OrdersService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrdersController {


    //bheemireddy90@gmail.com

    OrdersService ordersService;
    OrdersController (OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping(path = "/order")
    public Order createOrder(@RequestBody CreateOrderRequestDto requestDto) {
        return ordersService.placeOrder(requestDto);
    }

}
