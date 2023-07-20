package ss15_exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        triangleException();
    }
    public static void triangleException() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao canh a");
            double a = scanner.nextDouble();
            System.out.println("Nhap vao canh b");
            double b = scanner.nextDouble();
            System.out.println("Nhap vao canh c");
            double c = scanner.nextDouble();

            double cal = a * b * c;

            double ab = a + b;
            double bc = b + c;
            double ac = a + c;

            if (cal <= 0) {
                System.out.println("Ba canh nay KHONG the tao thanh tam giac");
            }else if (ac <= b || bc <= a || ab <= c) {
                System.out.println("Ba canh nay KHONG the tao thanh tam giac");
            } else {
                System.out.println("Ba canh nay co the tao thanh tam giac");
            }
        } catch (InputMismatchException ime) {
            System.out.println("Vui long nhap so vao");
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
