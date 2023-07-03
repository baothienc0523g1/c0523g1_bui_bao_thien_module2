package ss1_introduction_to_java.practice.src;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Nhập vào năm: ");
        year = scanner.nextInt();
        //cái year này là lấy số liệu từ scanner, scanner thì
        // lấy thông tin vào theo phương thức system.in,
        // scanner là một phương thức của lớp Scanner.
        // Còn cái System.out
        //chỉ đơn giản là hiển thị ra thông báo thôi;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận", year);
                } else {
                    System.out.printf("%d không phải là năm nhuận", year);
                }
            } else {
                System.out.printf("%d là năm nhuận", year);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận", year);
        }
    }
}
//chú ý cú pháp %d và chèn year sau cùng mà không cần dùng "+";

