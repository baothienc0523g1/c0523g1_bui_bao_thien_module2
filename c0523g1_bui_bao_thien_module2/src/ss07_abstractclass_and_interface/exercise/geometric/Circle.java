package ss07_abstractclass_and_interface.exercise.geometric;


public class Circle extends Shape {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Một hình tròn với radius = "
                + getRadius()
                + ", là lớp con của "
                + super.toString();
    }
    public void resizeable(double percent) {
        this.radius = this.radius * Math.sqrt(percent + 1);
    }
}
