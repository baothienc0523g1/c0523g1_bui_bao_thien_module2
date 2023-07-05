package ss3_array_and_method.practice;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Chương trình chuyển đổi nhiệt độ");
            System.out.println("Bấm 1: Để chuyển đổi từ độ F sang độ C");
            System.out.println("Bấm 2: Để chuyển đổi từ độ C sang độ F");
            System.out.println("Bấm 0: Để thoát chương trình");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Đã thoát chương trình");
            } else if (choice == 1) {
                System.out.println("Nhập vào nhiệt độ F");
                int fahrenheit = sc.nextInt();
                double resultF = ((fahrenheit - 32) * 0.5555);
                System.out.println(fahrenheit + " độ F = " + resultF + " độ C");
            } else if (choice == 2) {
                System.out.println("Nhập vào nhiệt độ C");
                int celsius = sc.nextInt();
                double resultC = (celsius * 1.8 + 32);
                System.out.println(celsius + "độ C = " + resultC + " độ F");
            }
        }
    }
}
