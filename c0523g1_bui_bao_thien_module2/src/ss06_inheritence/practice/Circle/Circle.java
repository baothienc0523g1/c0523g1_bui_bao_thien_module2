package ss06_inheritence.practice.Circle;

import ss06_inheritence.practice.Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }
}
