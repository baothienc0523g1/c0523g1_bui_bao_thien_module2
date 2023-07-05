package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = -1;
        while (start != 0) {
            System.out.println("Ấn phím bất kỳ để bắt đầu, ấn 0 để thoát");
            start = sc.nextInt();
            if (start == 0) {
                System.out.println("Program stopped");
            } else {
                System.out.println("Nhập vào số hàng của ma trận: ");
                int row = sc.nextInt();
                System.out.println("Nhập vào số cột của ma trận: ");
                int col = sc.nextInt();
                int matrix[][] = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print("Nhập vào phần tử thứ: " + (j + 1) + " hàng " + (i + 1) + " ");
                        matrix[i][j] = sc.nextInt();
                    }
                }
                System.out.printf("%-20s%s", "Ma trận A có 3 cột và 3 hàng với các phần tử được biểu diễn dưới đây: ", "");
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println("");
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println(" ");
                int result = 0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (i == j) {
                            result += matrix[i][j];
                        }
                    }
                }
                System.out.println("Tổng đường chéo chính của ma trận trên là: " + result);
            }
        }
    }
}

