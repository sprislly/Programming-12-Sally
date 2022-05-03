package com.sally.module1.l4;

abstract class TwoDShape {
    double width;
    double height;

    Colour colour;

    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){

    }

    public abstract double getArea();

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }
}
