package ss06_inheritence.practice.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("Blue", true, 3.5);
        System.out.println(circle);
    }
}
