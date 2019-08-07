package com.company.CustomCars.controller;


import com.company.CustomCars.dto.Suppliers;
import com.company.CustomCars.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SuppliersController {

    @Autowired
    private SupplierService supplierService;

    //routes
    @RequestMapping(value = "/suppliers", method = RequestMethod.POST)
    public Suppliers addSupplier(@RequestBody @Valid Suppliers newSupplier){
        return supplierService.addSupplier(newSupplier);
    }

        @RequestMapping(value = "/suppliers", method = RequestMethod.PUT)
        public Suppliers updateSupplier(@RequestBody @Valid Suppliers supplier){
            return supplierService.updateSupplier(supplier);
        }
}
