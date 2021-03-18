package com.exerciseFourPointTwoOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberDeterminantTest {
    LargestNumberDeterminant largestNumberDeterminant;

    @BeforeEach
    void setUp() {
        largestNumberDeterminant = new LargestNumberDeterminant(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void numberCanBeGotten(){
        largestNumberDeterminant.setNumber(19);
        assertEquals(19,largestNumberDeterminant.getLargestNumber());
    }





}