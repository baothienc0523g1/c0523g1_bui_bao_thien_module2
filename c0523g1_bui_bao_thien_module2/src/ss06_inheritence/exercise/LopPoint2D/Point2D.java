package ss06_inheritence.exercise.LopPoint2D;

import java.util.ArrayList;

public class Point2D {
    private float x;
    private float y;
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float[] getXY(){
        float data[] = new float[2];
        data[0] = x;
        data[1] = y;
        return data;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return " A 2D shape with x = " + getX() + " and y = " + getY();
    }
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D = new Point2D(3, 4 );
        System.out.println(point2D.toString());
        System.out.println(point2D.getXY());
    }
}
