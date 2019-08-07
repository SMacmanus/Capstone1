package com.company.CustomCars.controller;

import com.company.CustomCars.dto.Inventory;
import com.company.CustomCars.service.InventoryService;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    //routes
    @RequestMapping(value = "/inventory", method = RequestMethod.POST)
    public Inventory addItem(@RequestBody @Valid Inventory item){
        return inventoryService.addItem(item);
    }

    @RequestMapping(value = "/inventory/{partSerialNumber}", method = RequestMethod.DELETE)
    public void deleteItemIfDefectiveOrLost(@PathVariable("partSerialNumber") int partSerialNumber){
        inventoryService.deleteItemIfDefectiveOrLost(partSerialNumber);
    }



    //      unable to get this to work; method worked in sql, but could not
    //      get it to transfer
//    @RequestMapping(value = "/inventory/low", method = RequestMethod.GET)
//    public List<Inventory> findIfLessThanFifty(){
//        return inventoryService.findIfLessThanFifty();
//    }


}
