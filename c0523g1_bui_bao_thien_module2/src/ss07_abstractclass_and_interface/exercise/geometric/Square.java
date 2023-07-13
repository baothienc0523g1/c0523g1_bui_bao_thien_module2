package ss07_abstractclass_and_interface.exercise.geometric;

import ss07_abstractclass_and_interface.exercise.colorable.Colorable;

public class Square extends Rectangle implements Colorable, Resizeable {
    private double side;
    public Square() {
        this.side = 1.0;
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getArea() {
        return this.side * this.side;
    }
    public double getPerimeter() {
        return this.side * 4;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public String toString() {
        return "Hình vuông có cạnh = " +
                getSide() +
                " là lớp con của " +
                super.toString();
    }
    public void resizeable(double percent) {
        this.side = this.side * Math.sqrt(percent + 1);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all your side");
    }
}
