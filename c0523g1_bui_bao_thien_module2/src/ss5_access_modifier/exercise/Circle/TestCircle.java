package ss5_access_modifier.exercise.Circle;

import ss5_access_modifier.exercise.Circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}
