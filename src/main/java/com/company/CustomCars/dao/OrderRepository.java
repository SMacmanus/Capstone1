package com.company.CustomCars.dao;

import com.company.CustomCars.dto.Inventory;
import com.company.CustomCars.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    //unable to get this to work
    //    List<Inventory> markAsUsed(Date date);
}
