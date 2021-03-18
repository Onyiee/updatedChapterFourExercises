package com.exerciseFourPointTwoZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    SalaryCalculator salaryCalculator;

    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void hoursWorkedCanBeSet(){
        salaryCalculator.setHoursWorked(10);
        assertEquals(10,salaryCalculator.getHoursWorked());
    }

    @Test
    void ratePerHourCanBeSet(){
        salaryCalculator.setRatePerHour(200);
        assertEquals(200,salaryCalculator.getRatePerHour());
    }

    @Test
    void grossPayCanBeSet(){
        salaryCalculator.setGrossPay(10,200);
        assertEquals(2000,salaryCalculator.getGrossPay());
        salaryCalculator.setGrossPay(41,200);
        assertEquals(8300,salaryCalculator.getGrossPay());
    }


}