package com.exerciseFourPointOneSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;

    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void milesDrivenCanBeGotten(){
        gasMileage.setMilesDriven(35);
        assertEquals(35,gasMileage.getMilesDriven());
    }

    @Test
    void gallonsUsedCanBeGotten(){
        gasMileage.setGallonsUsed(10);
        assertEquals(10,gasMileage.getGallonsUsed());
    }

    @Test
    void milesPerGallonCanBeCalculated(){
        gasMileage.milesPerGallonCalculator(35,10);
        assertEquals(3.5,gasMileage.milesPerGallonCalculator(35,10));
    }

    @Test
    void totalMilesPerGallonCanBeCalculated(){
     gasMileage.setTotalMilesPerGallon(40.0);
     gasMileage.setTotalMilesPerGallon(30.0);
     assertEquals(70.0,gasMileage.getTotalMilesPerGallon());
    }
}