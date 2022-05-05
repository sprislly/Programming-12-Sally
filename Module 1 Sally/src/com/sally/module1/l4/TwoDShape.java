package com.sally.module1.l4;

abstract class TwoDShape {
    double width;
    double height;
    Colour colour;

    /**
     * Define 2D Shape.
     * @param width of the 2D shape; requires width > 0.
     * @param height of the 2D shape; requires height > 0.
     * @param colour of the 2D shape; requires colour = RED || GREEN || BLUE || NONE.
     */
    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    /**
     * Default constructor for Circle and Triangle classes.
     */
    public TwoDShape(){

    }

    /**
     * Get 2D Shape Area.
     * @return the area for the specific 2D shape.
     */
    public abstract double getArea();

    /**
     * Set 2D Shape Height.
     * @param height of the 2D shape; requires height > 0.
     */
    public void setHeight(double height){
        this.height = height;
    }

    /**
     * Get 2D Shape Height.
     * @return the height of the 2D shape.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set 2D Shape Width.
     * @param width of the 2D shape; requires width > 0.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Get 2D Shape Width.
     * @return the width of the 2D shape.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set 2D Shape Colour.
     * @param colour of the 2D shape; requires colour = RED || GREEN || BLUE || NONE.
     */
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    /**
     * Get 2D Shape Colour.
     * @return the colour of the 2D shape.
     */
    public Colour getColour() {
        return colour;
    }
}
