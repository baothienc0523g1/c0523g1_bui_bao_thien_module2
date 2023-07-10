package ss07_abstractclass_and_interface.practice.Comparator;

import ss06_inheritence.practice.Circle.Circle;
import java.util.Arrays;
import java.util.Comparator;
public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("Black", true, 4.6);

        System.out.println("Pre-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
