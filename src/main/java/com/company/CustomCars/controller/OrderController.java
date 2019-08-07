package com.company.CustomCars.controller;


import com.company.CustomCars.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.Order;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    //routes
    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public Order addOrder(@RequestBody Order order){
        return order;
    }

    @RequestMapping(value = "/orders/{orderId}", method = RequestMethod.DELETE)
    public void deleteOrder(@PathVariable int orderId){
        orderService.deleteOrder(orderId);
    }

}
