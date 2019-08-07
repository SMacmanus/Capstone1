package com.company.CustomCars.dao;



import com.company.CustomCars.dto.PartInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartInformationRepository extends JpaRepository<PartInformation, Integer> {
}
