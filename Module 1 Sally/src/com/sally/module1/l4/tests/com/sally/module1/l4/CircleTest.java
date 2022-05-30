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

    Circle cPositive;
    Circle cNegative;
    Circle cZero;
    Circle cNegativeOne;
    Circle cOne;

    @Before
    public void setUp() {
        cPositive = new Circle(32);
        cNegative = new Circle(-56);
        cZero = new Circle(0);
        cNegativeOne = new Circle(-1);
        cOne = new Circle(1);
    }

    @Test
    public void getArea() {
        //32
        Assert.assertEquals(32 * 32 * PI, cPositive.getArea(), 0.1);
        //-56
        Assert.assertEquals((-56) * (-56) * PI, cNegative.getArea(), 0.1);
        //0
        Assert.assertEquals(0 * 0 * PI, cZero.getArea(), 0.1);
        //-1
        Assert.assertEquals((-1) * (-1) * PI, cNegativeOne.getArea(), 0.1);
        //1
        Assert.assertEquals(1 * 1 * PI, cOne.getArea(), 0.1);
    }



}