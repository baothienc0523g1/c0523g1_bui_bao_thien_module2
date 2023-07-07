package ss06_inheritence.practice.Circle;

import ss06_inheritence.practice.Shape;

public class Rectangle extends Shape {
    private  double height;
    private  double width;
    public Rectangle(){
        this.height = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return (this.height * 2 + this.width * 2);
    }
    public double getPerimeter() {
        return this.height * this.width;
    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + getWidth() + " and length = " + getHeight() + ", which is a " +
                "subclass of" + super.toString();
    }
}
