package ss2_loop.practice;

import java.util.Scanner;

public class UngDungTinhLaiSuat {
    public static void main(String[] args) {
        int input;
        int time;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tien muon gui: ");
        input = sc.nextInt();
        System.out.println("Nhap vao thoi gian muon hoan tra von: ");
        time = sc.nextInt();
        System.out.println("Nhap lai suat theo quy dinh cua ngan hang: ");
        tax = sc.nextDouble();

        double result = 0;
        for (int i = 0; i < time; i++) {
            result = input * (tax/100)/12 * time;
        }
        System.out.println("Lai suat ban nhan duoc sau " + time + " la " + result);
    }
}
