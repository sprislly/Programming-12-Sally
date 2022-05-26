package com.sally.module1.l4;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;

public class CircleTest {
    //partition
    /*
    radius is positive
    radius is negative
    Boundary Cases
    radius = -1, 0, 1
     */

    Circle circle;
    @Before
    public void setUp() {
        circle = new Circle(32);
    }

    @Test
    public void getArea() {
        //32
        //-56
        //0
        //-1
        //1
        Assert.assertEquals(32 * 32 * PI, circle.getArea(), 0.1);
    }



}