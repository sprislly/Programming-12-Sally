package com.sally.module1.l4;

class Triangle extends TwoDShape implements Rotate {
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
        double h;
        double s = side1 + side2 + side3;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
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

    int d = 0;
    @Override
    public void rotate90() {
        d += 90;
    }

    @Override
    public void rotate180() {
        d += 180;
    }

    @Override
    public void rotate(double degree) {
        d += degree;
    }
}
