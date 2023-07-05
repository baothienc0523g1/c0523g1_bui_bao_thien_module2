package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        //định nghĩa mảng ma trận là một mảng 2 chiều;
        Scanner sc = new Scanner(System.in);
        int row = -1;
        int col = -1;
        //định nghĩa ma trận với số hàng và cột do người dùng nhập vào;
        while (row <= 0 || col <= 0) {
            System.out.println("Nhập vào số hàng của ma trận: ");
            row = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận: ");
            col = sc.nextInt();
            if (col <= 0 || row <= 0) {
                System.out.println("Kích thước nhập vào không hợp lệ");
            }
        }
        //định nghĩa mảng matrix có cột hàng là số liệu nhập vào
        int matrix[][] = new int[row][col];

        //thêm phần tử vào mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập vào phần tử hàng " + (i + 1) + " cột " + (j + 1) + " ");
                int input = sc.nextInt();
                matrix[i][j] = input;
            }
        }

        //in ma trận ra console
        System.out.printf("%-30s%s", "Ma trận có dạng ", "");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println("");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        System.out.println("");
        //tìm phần tử lớn nhất
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
            System.out.println("Phần tử lớn nhất trong ma trận vừa nhập là: " + maxElement);
    }
}
