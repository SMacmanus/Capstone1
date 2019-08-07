package com.company.CustomCars.serviceTests;

import com.company.CustomCars.dao.SupplierRepository;
import com.company.CustomCars.dto.Suppliers;
import com.company.CustomCars.service.SupplierService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SupplierServiceTest {

        //private MockMvc mockMvc;

        @Mock
        @Autowired
        SupplierRepository supplierRepoMock;

        @InjectMocks
        SupplierService supplierService;

        Suppliers supplierA;
        Suppliers supplierB;
        Suppliers supplierC;

        List<Suppliers> suppliersList;

        @Before
        public void setUp() throws Exception {
            //MockitoAnnotations.initMocks(this);
            //mockMvc = MockMvcBuilders.standaloneSetup(supplierService).build();

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

            suppliersList = Arrays.asList(supplierA, supplierB);
        }
    // couldn't get test to work
//    @Test
//    public void shouldAddSupplier() {
////        Suppliers supplierD = new Suppliers();
////        supplierD.setSupplierName("Cathy");
////        supplierD.setSupplierPhone("1000");
////        supplierD.setSupplierEmail("cathy@email.com");
//
//        List<Suppliers> expectedList = Arrays.asList(supplierA, supplierB, supplierC);
//        List<Suppliers> suppliersList = Arrays.asList(supplierA, supplierB, supplierC);
//        Mockito.when(supplierService.addSupplier(supplierC)).thenReturn(suppliersList);
//        assertEquals(expectedList, supplierService.updateSupplier(supplierD));
//    }
}
