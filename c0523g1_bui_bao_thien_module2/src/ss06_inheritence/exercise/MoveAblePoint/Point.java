package ss06_inheritence.exercise.MoveAblePoint;

public class Point {
    protected float x;
    protected float y;
    public Point() {
        this.x = 0;
        this.x = 0;
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return this.x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float data[] = new float[2];
        data[0] = this.x;
        data[1] = this.y;
        return data;
    }
    public String toString() {
        return "A point with x = " + x + " and y = " + y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        System.out.println("Set point with x = 7, y = 107");
        point = new Point(7,107);
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.setXY(77,100);
        System.out.println(point.toString());
    }
}
