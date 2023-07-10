package ss07_abstractclass_and_interface.practice.Comparable;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle circle[] = new ComparableCircle[3];
        circle[0] = new ComparableCircle(3.6);
        circle[1] = new ComparableCircle();
        circle[2] = new ComparableCircle("black",false,3.5);

        System.out.println("pre-sorted");
        for (ComparableCircle comparableCircle : circle) {
            System.out.println(circle.toString());
        }

        System.out.println("after-sorted");
        for (ComparableCircle comparableCircle : circle) {
            System.out.println(circle.toString());
        }
    }
}
