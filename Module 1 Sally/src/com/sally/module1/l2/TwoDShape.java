package com.sally.module1.l2;

abstract class TwoDShape {
    double width;
    double height;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){

    }

    public abstract double getArea(){
        return width * height;

    }

    public void setHeight(double height){

    }

}
