package com.sally.module1.l4;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    /**
     * Creates a Circle.
     * @param radius of the circle; requires radius > 0.
     */
    Circle(double radius){
        this.radius = radius;
    }

    /**
     * Area of a Circle.
     * @return the area of the circle.
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Circle toString.
     * @return the shape, the characteristics, and area of the circle.
     */
    @Override
    public String toString() {
        return "Circle, " + "Radius: " + radius + ", Area: " + getArea() + ".";
    }
}
