package ss07_abstractclass_and_interface.exercise.geometric;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,6);
        Square square = new Square(3);
        Shape[] arrs = new Shape[3];
        arrs[0] = circle;
        arrs[1] = rectangle;
        arrs[2] = square;
        System.out.println("***** Trước khi thay đổi kích cỡ *****");
        for (Shape arr : arrs) {
            System.out.println(arr.toString());
            System.out.println("Có diện tích là: " + arr.getArea());
        }
        System.out.println("***** Sau khi thay đổi kích cỡ *****");
        for (Shape arr : arrs) {
            arr.resizeable(Math.random());
            System.out.println(arr.toString());
            System.out.println("Có diện tích là: "+ arr.getArea());
        }
    }
}
