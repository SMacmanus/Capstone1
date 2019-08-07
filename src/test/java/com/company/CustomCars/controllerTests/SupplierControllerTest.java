package com.company.CustomCars.controllerTests;
import com.company.CustomCars.controller.SuppliersController;
import com.company.CustomCars.dao.SupplierRepository;
import com.company.CustomCars.dto.Suppliers;
import com.company.CustomCars.service.SupplierService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SupplierControllerTest {

    private MockMvc mockMvc;

    @Mock
    SupplierService mockSupplierService;

    @InjectMocks
    SuppliersController suppliersController;

    Suppliers supplierA;
    Suppliers supplierB;
    Suppliers supplierC;

    List<Suppliers> suppliersList;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(suppliersController).build();

        supplierA = new Suppliers();
        supplierA.setSupplierName("Al");
        supplierA.setSupplierPhone("1324");
        supplierA.setSupplierEmail("al@email.com");

        supplierB = new Suppliers();
        supplierB.setSupplierName("Bob");
        supplierB.setSupplierPhone("1233");
        supplierB.setSupplierEmail("bob@email.com");

        supplierC = new Suppliers();
        supplierC.setSupplierName("Carl");
        supplierC.setSupplierPhone("1232");
        supplierC.setSupplierEmail("carl@email.com");

        suppliersList = Arrays.asList(supplierA, supplierB, supplierC);
    }

    // could not figure out how to test controller layer
//    @Test
//    public void shouldAddSupplier() throws Exception {
//        suppliersList = Arrays.asList(supplierA, supplierB, supplierC);
//        when(mockSupplierService
//            .addSupplier(suppliersList.get(0))
//            .thenReturn(suppliersList));

}
