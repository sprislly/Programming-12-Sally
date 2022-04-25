package com.sally.module1.l1;
import java.lang.Math;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height){

    }

    public Triangle(double side1, double side2, double side3){

    }

    private double heronsHeight(){
        double s;
        double area;
        double h;
        s = side1 + side2 + side3;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        h = area * 2 / side2;
        return h;
    }

    public double getArea(){
        return width * height /2;
    }

}
