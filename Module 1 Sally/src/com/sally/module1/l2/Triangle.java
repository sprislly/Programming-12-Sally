package com.sally.module1.l2;

import com.sally.module1.l1.TwoDShape;
class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height){

    }

    public Triangle(double side1, double side2, double side3){

    }

    private double heronsHeight(){
        double area;
        double h;
        double s = side1 + side2 + side3;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        h = area * 2 / side2;
        return h;
    }

    abstract double getArea(){
        return width * height /2;
    }

}
