package ss4_oop.exercise;

public class Fan {
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed = LOW;
    double radius = 5;
    String color = "blue";
    boolean status = false;

    public Fan() {
    }
    public Fan(int speed, String color, double radius, boolean status) {
        this.speed = speed;
        this.color = color;
        this.radius = radius;
        this.status = status;
    }
    public int getSpeed() {
        return this.speed = speed;
    }

    public int setSpeed(int speed) {
        if (speed == 2) {
            return this.speed = MEDIUM;
        } else if (speed == 1) {
            return this.speed = LOW;
        } else {
            return speed = FAST;
        }
    }
    public boolean setStatus(boolean status) {
        return this.status = status;
    }

    private String getColor() {
        return this.color;
    }

    private double getRadius() {
        return this.radius;
    }

    public String toString() {
        if (this.status == true) {

            return "This fan is on, speed is " + getSpeed() + ", color is : " + getColor() + ", radius is: " + getRadius();
        } else {
            return "This fan is off!";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(fast, "yellow", 10, true);
        Fan fan2 = new Fan(medium, "blue", 5, false);
        System.out.println("Before");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println("After");
        fan1.setSpeed(1);
        fan1.setStatus(false);
        System.out.println("");
        System.out.println(fan1.toString());
        fan2.setStatus(true);
        fan2.setSpeed(3);
        System.out.println("");
        System.out.println(fan2.toString());
        System.out.println(fan2.getColor());
    }
}
