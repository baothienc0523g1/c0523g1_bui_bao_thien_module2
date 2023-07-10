package ss07_abstractclass_and_interface.exercise.Geometric;

public abstract class Shape implements Resizeable {
    private String color;
    private boolean filled;
    public Shape() {
        this.color  = "xanh lá";
        this.filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "Một hình dạng chưa xác định màu " +
                getColor() +
                " và " +
                (isFilled() ? "filled" : "not filled");
    }
    public void resizeable(double percent) {

    }
    public double getArea() {
        return this.getArea();
    }
}
