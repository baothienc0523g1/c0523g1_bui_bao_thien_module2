package ss2_loop.practice;

import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        int num;
        int count = 0;
        System.out.println("Nhap so can kiem tra tinh nguyen to");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong phai la so nguyen to");
        }
    }
}
