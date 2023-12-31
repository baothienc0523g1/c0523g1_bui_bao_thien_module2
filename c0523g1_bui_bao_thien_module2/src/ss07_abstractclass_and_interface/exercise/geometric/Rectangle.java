package ss07_abstractclass_and_interface.exercise.geometric;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật {" +
                "rộng =" + width +
                ", dài =" + length +
                '}' +
                " và là lớp con của " +
                super.toString();
    }

    @Override
    public void resizeable(double percent) {
        double k = this.width / length;
        this.length = this.length * Math.sqrt(percent + 1);
        this.width = k * this.length;
    }
}
