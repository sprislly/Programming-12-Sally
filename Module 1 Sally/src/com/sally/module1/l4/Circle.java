package com.sally.module1.l4;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle, " + "Radius: " + radius + ", Area: " + getArea() + ".";
    }
}
