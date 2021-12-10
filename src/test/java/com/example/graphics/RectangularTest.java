package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangularTest {
    private Rectangular rectangular;

    @BeforeEach
    public void setup(){
        rectangular = new Rectangular(1,1,2,2);
    }

    @Test
    public void computeCircumferenceTest(){
        assertEquals(rectangular.computeCircumference(),8.0,0.01);
    }

    @Test
    public void computeAreaTest(){
        assertEquals(rectangular.computeArea(),4.0,0.01);
    }
}
