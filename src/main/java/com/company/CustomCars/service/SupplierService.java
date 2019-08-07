package com.company.CustomCars.service;

import com.company.CustomCars.dao.SupplierRepository;
import com.company.CustomCars.dto.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepo;

    public Suppliers addSupplier(Suppliers supplier){
        supplierRepo.save(supplier);
        return supplier;
    }

    public Suppliers updateSupplier(Suppliers supplier){
        supplierRepo.save(supplier);
        return supplier;
    }
}
