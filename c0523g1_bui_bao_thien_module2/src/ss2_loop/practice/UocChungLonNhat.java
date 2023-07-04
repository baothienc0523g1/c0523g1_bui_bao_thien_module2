package ss2_loop.practice;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so b");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc so chung lon nhat");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc so chung lon nhat la " + a);
    }
}
