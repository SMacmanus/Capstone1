package com.company.CustomCars.service;

import com.company.CustomCars.dao.PartInformationRepository;
import com.company.CustomCars.dto.PartInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PartInformationService {

    @Autowired
    private PartInformationRepository partRepo;

    public PartInformation addPart(PartInformation part){
        partRepo.save(part);
        return part;
    }

    public PartInformation updatePart(PartInformation part){
        partRepo.save(part);
        return part;
    }
}
