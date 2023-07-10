package ss06_inheritence.exercise.MoveAblePoint;

import java.util.Arrays;

public class MoveAblePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveAblePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return this.xSpeed;
    }
    public void setXSpeed(float x) {
        this.xSpeed = x;
    }
    public float getYSpeed() {
        return this.ySpeed;
    }
    public void setYSpeed(float y) {
        this.ySpeed = y;
    }
    public void setSpeed(float x, float y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }
    public float[] getSpeed() {
        float data[] = new float[2];
        data[0] = xSpeed;
        data[1] = ySpeed;
        return data;
    }
    public String toString() {
        return "This is a Move Able Point with X Speed = " + this.xSpeed + " and Y Speed = " + this.ySpeed
                + " move from a a superclass " + super.toString();
    }
    public MoveAblePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint();
        System.out.println(moveAblePoint.toString());
        moveAblePoint = new MoveAblePoint(333,666);
        System.out.println(moveAblePoint.toString());
        moveAblePoint.setXSpeed(555);
        System.out.println(moveAblePoint.toString());
        System.out.println(Arrays.toString(moveAblePoint.getSpeed()));
        moveAblePoint = new MoveAblePoint(55,66,200,200);
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
