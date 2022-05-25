package com.sally.module1.l4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.*;

public class TriangleTest {
    //partition
    /*
    length is positive, width is positive
    length is negative, width is negative
    length is positive, width is negative
    length is negative, width is positive
    Boundary Cases
    length or width = -1, 0, 1
     */

    Triangle triangle;
    @Before
    public void setUp() {
        triangle = new Triangle(32, 56);
    }

    @Test
    public void getArea() {
        //32 * 56
        //65 * -32
        //56 * 0
        //-1 * 65
        //32 * 1
        Assert.assertEquals(32 * 56, triangle.getArea(), 0.1);
    }


}