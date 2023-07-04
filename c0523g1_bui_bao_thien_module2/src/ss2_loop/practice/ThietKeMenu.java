package ss2_loop.practice;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh tam giac");
            System.out.println("2. Ve hinh vuong");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("0. Thoat");
            System.out.println("Nhap vao lua chon: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve hinh tam giac");
                    System.out.println("*********");
                    System.out.println("********");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Ve hinh vuong");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    System.out.println("**********");
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    break;
            }
        }
        if (choice == 0) {
            System.out.println("Da thoat chuong trinh");
        }
    }
}
