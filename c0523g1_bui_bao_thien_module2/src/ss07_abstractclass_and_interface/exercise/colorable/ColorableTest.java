package ss07_abstractclass_and_interface.exercise.colorable;

import ss07_abstractclass_and_interface.exercise.geometric.Circle;
import ss07_abstractclass_and_interface.exercise.geometric.Rectangle;
import ss07_abstractclass_and_interface.exercise.geometric.Shape;
import ss07_abstractclass_and_interface.exercise.geometric.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] arrays = new Shape[4];
        Rectangle rectangle = new Rectangle(3, 6);
        Circle circle = new Circle(2);
        Square square = new Square(3);
        Square square1 = new Square(5);
        arrays[0] = rectangle;
        arrays[1] = circle;
        arrays[2] = square;
        arrays[3] = square1;

        for (Shape arr : arrays) {
            System.out.println(arr + " có diện tích là "
                    + arr.getArea());
            if (arr instanceof Square) {
                ((Square) arr).howToColor();
            }
            System.out.println(" ");
        }
    }
}
