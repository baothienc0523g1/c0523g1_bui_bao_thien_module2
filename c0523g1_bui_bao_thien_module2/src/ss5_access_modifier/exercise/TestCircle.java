package ss5_access_modifier.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle clr1 = new Circle();
        Circle clr2 = new Circle(3);
        System.out.println(clr1.getArea());
        System.out.println(clr2.getArea());
    }
}
