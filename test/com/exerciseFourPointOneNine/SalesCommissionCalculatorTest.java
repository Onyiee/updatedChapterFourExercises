package com.exerciseFourPointOneNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salesCommissionCalculator;

    @BeforeEach
    void setUp() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
    }

//    @Test
//    void grossSalesCanBeSet(){
//        salesCommissionCalculator.setGrossSales(200);
//        assertEquals(200,salesCommissionCalculator.getGrossSales());
//    }

    @Test
    void payWithCommissionCanBeSet(){
       salesCommissionCalculator.setPayWithCommission(500);
       assertEquals(650,salesCommissionCalculator.getPayWithCommission());

    }

    @Test
    void listOfItemsWithTheirPricesCanBeGotten(){
        salesCommissionCalculator.listOfItemsWithTheirPrices(1);
        assertEquals(239.99,salesCommissionCalculator.listOfItemsWithTheirPrices(1));
    }

    @Test
    void grossSalesCanBeCalculated(){
        salesCommissionCalculator.grossSalesCalculator(2);
        salesCommissionCalculator.grossSalesCalculator(3);
        assertEquals(406.73,salesCommissionCalculator.getGrossSales());
    }

}