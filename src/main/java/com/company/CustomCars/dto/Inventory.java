package com.company.CustomCars.dto;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "inventory")
public class Inventory {

    //kept causing Spring server to malfunction, had to comment out
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "partTypeId")
//    private PartInformation partInformation;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partSerialNumber;

    private Integer partTypeId;

    private Boolean inUse;



    public Integer getPartSerialNumber() {
        return partSerialNumber;
    }

    public void setPartSerialNumber(Integer partSerialNumber) {
        this.partSerialNumber = partSerialNumber;
    }

    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }
}
