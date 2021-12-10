package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    private Circle circle;

    @BeforeEach
    public void setup(){
        circle = new Circle(1,1,2);
    }

    @Test
    public void computeCircumferenceTest(){
        assertEquals(circle.computeCircumference(),12.5663706144, 0.01);
    }

    @Test
    public void computeAreaTest(){
        assertEquals(circle.computeArea(),12.5663706144,0.01);
    }
}
