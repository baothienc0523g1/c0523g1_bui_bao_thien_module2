package ss2_loop.exercise;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int input = -1;
        Scanner sc = new Scanner(System.in);
        while (input != 0) {

            System.out.println("Ban muon ve hinh gi?");
            System.out.println("1. Hinh tam giac");
            System.out.println("2. Hinh vuong");
            System.out.println("3. Hinh chu nhat");
            System.out.println("0. Thoat khoi menu");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Nhap vao chieu cao tam giac");
                    int h = sc.nextInt();
                    for (int i = 1; i <= h; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhap vao canh cua hinh vuong");
                    int a = sc.nextInt();
                    for (int i = 1; i <= a; i++) {
                        for (int j = 1; j <= a; j++) {
                                System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao chieu rong cua hinh chu nhat");
                    int height = sc.nextInt();
                    System.out.println("Nhap vao chieu dai cua hinh chu nhat");
                    int width = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                                System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("");
                    break;
            }
        }
        if (input == 0) {
            System.out.println("Da thoat chuong trinh");
        }
    }
}
