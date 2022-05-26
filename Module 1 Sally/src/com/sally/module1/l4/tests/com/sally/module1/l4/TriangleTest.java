package com.sally.module1.l4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



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

    Triangle lw;
    Triangle sides;
    @Before
    public void setUp() {
        lw = new Triangle(32, 56);
        sides = new Triangle(32, 56, 65);
    }

    @Test
    public void getArea() {
        //32 * 56
        //65 * -32
        //56 * 0
        //-1 * 65
        //32 * 1
        Assert.assertEquals(32 * 56 / 2, lw.getArea(), 0.1);
    }

    @Test
    public void heronsHeight() {
        //32 + 56 + 65
        //-32 + 56 + 65
        //32 + 0 + 65
        //32 + 56 + 1
        //32 + -1 + 65
        Assert.assertEquals(Math.sqrt((32 + 56 + 65) * ((32 + 56 + 65) - 32) * ((32 + 56 + 65) - 56) * ((32 + 56 + 65) - 65)) * 2 / 56, sides.heronsHeight(), 0.1);
    }


}