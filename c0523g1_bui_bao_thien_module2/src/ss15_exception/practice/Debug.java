package ss15_exception.practice;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("---GIAI PHUONG TRINH BAC 1----");
        System.out.println("Phuong trinh bac 1 co dang: a * x + b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b/a;
            System.out.println("The solution is: " + solution);
        } else {
            if (b == 0) {
                System.out.println("The solution is all 'x'");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
