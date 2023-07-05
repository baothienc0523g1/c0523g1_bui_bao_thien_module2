package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TinhTongCacSoTrenCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Bấm phím bất kỳ để bắt đầu, bấm '0' để thoát");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Dừng chương trình!");
            } else {
                System.out.print("Nhập vào số hàng của ma trận: ");
                int row = sc.nextInt();
                System.out.print("Nhập vào số cột của ma trận: ");
                int col = sc.nextInt();
                int matrix[][] = new int[row][col];
                for (row = 0; row < matrix.length; row++) {
                    for (col = 0; col < matrix[row].length; col++) {
                        matrix[row][col] = (int) (Math.random() * 100);
                    }
                }
                System.out.printf("%-20s%s", "Ma trận có dạng: ", "");
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println("");
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println(" ");
                int num = -1;
                while (num <= 0 || num > col) {
                    System.out.println("Nhập vào cột muốn tính tổng: ");
                    num = sc.nextInt();
                    if (num <= 0 || num > col) {
                        System.out.println("Số cột không hợp lệ");
                    }
                }
                int result = 0;
                for (int i = 0; i < matrix.length; i++) {
                    result += matrix[i][(num - 1)];
                }
                System.out.println("Tổng của cột " + num + " là: " + result);
            }
        }
    }
}
