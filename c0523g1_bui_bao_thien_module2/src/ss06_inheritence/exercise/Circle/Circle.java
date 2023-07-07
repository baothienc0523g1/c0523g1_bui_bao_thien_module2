package ss06_inheritence.exercise.Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * 2 * Math.PI;
    }

    public double getParameter() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public String toString() {
        return "A circle with radius = " + getRadius() + " and color is " + getColor();
    }
}
