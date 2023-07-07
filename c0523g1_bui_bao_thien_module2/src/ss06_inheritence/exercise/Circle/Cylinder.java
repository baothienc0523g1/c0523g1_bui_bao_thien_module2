package ss06_inheritence.exercise.Circle;

public class Cylinder extends Circle {
    private double height;
    private double radius;
    private String color;

    public Cylinder() {
        super();
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public double getVolume() {
        return getHeight() * Math.pow(this.getRadius(), 2) * Math.PI;
    }
    public String getColor() {
        return super.getColor();
    }
    public String toString() {
        return"This is a cylinder with height = " + getHeight() + ", with color = " + getColor() + ", and radius = " + getRadius()
                + " and a subclass of " + super.toString();
    }
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5, 2.3, "Blue" );
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }

}
