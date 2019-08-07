package com.company.CustomCars.dao;

import com.company.CustomCars.dto.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SupplierRepository extends JpaRepository<Suppliers, Integer> {
}
