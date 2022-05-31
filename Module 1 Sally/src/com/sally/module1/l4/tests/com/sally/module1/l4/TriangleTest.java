package com.sally.module1.l4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TriangleTest {
    //getArea() partition
    /*
    length is positive, width is positive
    length is negative, width is negative
    length is positive, width is negative
    length is negative, width is positive
    Boundary Cases
    length or width = -1, 0, 1
     */

    //heronsHeight() partition
    /*
    side1 is positive, side2 is positive, side3 is positive
    side1 is negative, side2 is negative, side3 is negative
    side1 is negative, side2 is positive, side3 is positive
    side1 is positive, side2 is negative, side3 is positive
    side1 is positive, side2 is positive, side3 is negative
    side1 is positive, side2 is positive, side3 is positive
    Boundary Cases
    length or width = -1, 0, 1
     */

    Triangle lwPositive;
    Triangle lwNegative;
    Triangle lNegative;
    Triangle wNegative;
    Triangle wZero;
    Triangle wOne;
    Triangle lNegativeOne;

    Triangle sidesPositive;
    Triangle sidesNegative;
    Triangle side1Negative;
    Triangle side2Negative;
    Triangle side3Negative;
    Triangle side2Zero;
    Triangle side3One;
    Triangle side2NegativeOne;


    @Before
    public void setUp() {
        lwPositive = new Triangle(32, 56);
        lwNegative = new Triangle(-32, -56);
        lNegative = new Triangle(-65, 32);
        wNegative = new Triangle(65, -32);
        wZero = new Triangle(56, 0);
        lNegativeOne = new Triangle(-1, 65);
        wOne = new Triangle(32, 1);

        sidesPositive = new Triangle(32, 56, 65);
        sidesNegative = new Triangle(-32, -56, -65);
        side1Negative = new Triangle(-32, 56, 65);
        side2Negative = new Triangle(32, -56, 65);
        side3Negative = new Triangle(32, 56, -65);
        side2Zero = new Triangle(32, 0, 65);
        side2NegativeOne = new Triangle(32, -1, 65);
        side3One = new Triangle(32, 56, 1);

    }

    @Test
    public void getArea() {
        //32 * 56
        Assert.assertEquals(32 * 56 / 2, lwPositive.getArea(), 0.5);
        //-32 * -56
        Assert.assertEquals(-32 * -56 / 2, lwNegative.getArea(), 0.5);
        //-65 * 32
        Assert.assertEquals(-65 * 32 / 2, wNegative.getArea(), 0.5);
        //65 * -32
        Assert.assertEquals(65 * (-32) / 2, wNegative.getArea(), 0.5);
        //56 * 0
        Assert.assertEquals(56 * 0 / 2, wZero.getArea(), 0.5);
        //-1 * 65
        Assert.assertEquals((-1) * 65 / 2, lNegativeOne.getArea(), 0.5);
        //32 * 1
        Assert.assertEquals(32 * 1 / 2, wOne.getArea(), 0.5);
    }



    @Test
    public void heronsHeight() {
        //32 + 56 + 65
        Assert.assertEquals(Math.sqrt((32 + 56 + 65) * ((32 + 56 + 65) - 32) * ((32 + 56 + 65) - 56) * ((32 + 56 + 65) - 65)) * 2 / 56, sidesPositive.heronsHeight(), 0.1);
        //-32 - 56 - 65
        Assert.assertEquals(Math.sqrt((-32 - 56 - 65) * ((-32 - 56 - 65) + 32) * ((-32 - 56 - 65) + 56) * ((-32 - 56 - 65) + 65)) * 2 / (-56), sidesNegative.heronsHeight(), 0.1);
        //-32 + 56 + 65
        Assert.assertEquals(Math.sqrt((-32 + 56 + 65) * ((-32 + 56 + 65) + 32) * ((-32 + 56 + 65) - 56) * ((-32 + 56 + 65) - 65)) * 2 / 56, side1Negative.heronsHeight(), 0.1);
        //32 - 56 + 65
        Assert.assertEquals(Math.sqrt((32 - 56 + 65) * ((32 - 56 + 65) - 32) * ((32 - 56 + 65) + 56) * ((32 - 56 + 65) - 65)) * 2 / (-56), side2Negative.heronsHeight(), 0.1);
        //32 + 56 - 65
        Assert.assertEquals(Math.sqrt((32 + 56 - 65) * ((32 + 56 - 65) - 32) * ((32 + 56 - 65) - 56) * ((32 + 56 - 65) + 65)) * 2 / 56, side3Negative.heronsHeight(), 0.1);
        //32 + 0 + 65
        Assert.assertEquals(Math.sqrt((32 + 0 + 65) * ((32 + 0 + 65) - 32) * ((32 + 0 + 65) - 0) * ((32 + 0 + 65) - 65)) * 2 / 0, side2Zero.heronsHeight(), 0.1);
        //32 - 1 + 65
        Assert.assertEquals(Math.sqrt((32 - 1 + 65) * ((32 - 1 + 65) - 32) * ((32 - 1 + 65) + 1) * ((32 - 1 + 65) - 65)) * 2 / (-1), side2NegativeOne.heronsHeight(), 0.1);
        //32 + 56 + 1
        Assert.assertEquals(Math.sqrt((32 + 56 + 1) * ((32 + 56 + 1) - 32) * ((32 + 56 + 1) - 56) * ((32 + 56 + 1) - 1)) * 2 / 56, side3One.heronsHeight(), 0.1);

    }


}