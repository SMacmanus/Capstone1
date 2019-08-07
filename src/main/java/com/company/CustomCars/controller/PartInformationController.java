package com.company.CustomCars.controller;

import com.company.CustomCars.dto.PartInformation;
import com.company.CustomCars.service.PartInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PartInformationController {

    @Autowired
    private PartInformationService partInformationService;

    //routes
    @RequestMapping(value = "/parts", method = RequestMethod.POST)
    public PartInformation addPart(@RequestBody @Valid PartInformation part){
        return partInformationService.addPart(part);
    }

    @RequestMapping(value = "/parts", method = RequestMethod.PUT)
    public PartInformation updatePart(@RequestBody @Valid PartInformation part){
        return partInformationService.updatePart(part);
    }
}
