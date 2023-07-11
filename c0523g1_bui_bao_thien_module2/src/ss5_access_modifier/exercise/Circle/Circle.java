package ss5_access_modifier.exercise.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
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
