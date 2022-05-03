package com.sally.module1.l2;

class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight(){
        double area;
        double h;
        double s = side1 + side2 + side3;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        h = area * 2 / side2;
        return h;
    }

    public double getArea(){
        return width * height /2;
    }

    @Override
    public String toString() {
        return "Triangle, " + "Base: " + width + ", Height: " + height + ", Area: " + getArea() + ".";
    }
}
