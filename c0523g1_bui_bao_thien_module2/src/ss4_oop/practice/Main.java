package ss4_oop.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of this rectangle is " + rectangle.getPerimeter());
        System.out.println("Area of this rectangle is " + rectangle.getArea());
    }
}
