package ss06_inheritence.practice.Circle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,3.3);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.4,3.5,"Blue",true);
    }
}
