package com.company.CustomCars.service;

import com.company.CustomCars.dao.InventoryRepository;
import com.company.CustomCars.dao.OrderRepository;
import com.company.CustomCars.dto.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;

@Component
public class InventoryService{

    @Autowired
    private InventoryRepository inventoryRepo;

    public Inventory addItem(Inventory item){
        inventoryRepo.save(item);
        return item;
    }

    public void deleteItemIfDefectiveOrLost(int partSerialNumber){
        inventoryRepo.deleteById(partSerialNumber);
    }


//    public List<Inventory> findIfLessThanFifty(){
//        return inventoryRepo.findIfLessThanFifty();
//    }
}
