package com.company.CustomCars.service;

import com.company.CustomCars.dao.InventoryRepository;
import com.company.CustomCars.dao.OrderRepository;
import com.company.CustomCars.dto.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.MethodArgumentNotValidException;

import java.security.InvalidParameterException;



import java.util.Date;
import java.util.List;
import com.company.CustomCars.dao.*;
import com.company.CustomCars.dto.*;

@Component
public class OrderService{

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private InventoryRepository inventoryRepo;

    public Order addOrder(Order order){
        //markAsUsed(order);
        this.orderRepo.save(order);
        return order;
    }

    public void deleteOrder(int orderId){
        orderRepo.deleteById(orderId);
    }

//    this doesn't work
//    public void markAsUsed(Order order){
//        int partTypeId = order.getPartTypeId();
//        int partQuantity = order.getQuantity();
//
//        Inventory changeInventory = new Inventory();
//        changeInventory.setPartTypeId(partTypeId);
//        if(changeInventory.getPartTypeId() == partTypeId){
//            for(int i = 1; i < partQuantity; i++){
//                changeInventory.setInUse(true);
//            }
//        }
//        inventoryRepo.save(changeInventory);
//    }

//    public List<Inventory> markAsUsed(Date startDate){
//
//    }


}
