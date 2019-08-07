package com.company.CustomCars.dao;

import com.company.CustomCars.dto.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    // unable to get this to work
    //    @Query("SELECT part_type_id, COUNT(*) FROM inventory GROUP BY part_type_id HAVING COUNT(*)<50;")
    //    List<Inventory> findIfLessThanFifty();
}
