package com.company.CustomCars.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "partInformation")
public class PartInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partTypeId;

    private String partName;

    private Integer supplierId;

    private BigDecimal partTypePrice;

    public Integer getPartTypeId() {
        return partTypeId;
    }

    public void setPartTypeId(Integer partTypeId) {
        this.partTypeId = partTypeId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getPartTypePrice() {
        return partTypePrice;
    }

    public void setPartTypePrice(BigDecimal partTypePrice) {
        this.partTypePrice = partTypePrice;
    }
}
