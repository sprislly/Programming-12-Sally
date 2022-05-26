package com.sally.module1.l4;

class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;

    /**
     * Define Triangle using width and height.
     * @param width of the triangle; requires width > 0.
     * @param height of the triangle; requires height > 0.
     */
    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * Define Triangle using 3 sides.
     * @param side1 of the triangle; requires side1 > 0.
     * @param side2 of the triangle; requires side2 > 0.
     * @param side3 of the triangle; requires side3 > 0.
     */
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Herons Height Formula.
     * @return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) * 2 / side2.
     */
    double heronsHeight(){
        double h;
        double s = side1 + side2 + side3;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        h = area * 2 / side2;
        return h;
    }

    /**
     * Get Triangle Area
     * @return width * height / 2.
     */
    public double getArea(){
        return width * height /2;
    }

    /**
     * Triangle toString.
     * @return the shape, the characteristics, and area of the triangle.
     */
    @Override
    public String toString() {
        return "Triangle, " + "Base: " + width + ", Height: " + height + ", Area: " + getArea() + ".";
    }

    int d = 0;

    /**
     * Rotate the Triangle 90 Degrees.
     */
    @Override
    public void rotate90() {
        d += 90;
    }

    /**
     * Rotate the Triangle 180 Degrees.
     */
    @Override
    public void rotate180() {
        d += 180;
    }

    /**
     * Rotate Triangle.
     * @param degree of the triangle.
     */
    @Override
    public void rotate(double degree) {
        d += degree;
    }
}
