package ss5_access_modifier.exercise;

public class Circle {
    public double radius = 1.0;
    public String color = "red";
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }
    protected double getRadius() {
        return this.radius;
    }
}
