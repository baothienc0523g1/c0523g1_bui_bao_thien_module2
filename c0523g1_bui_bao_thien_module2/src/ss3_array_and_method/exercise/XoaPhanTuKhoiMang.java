package ss3_array_and_method.exercise;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 5, 7, 8, 10, 12};
        System.out.printf("%-20s%s", "Mảng bao gồm các phần tử: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Nhập vào phần tử muốn xóa khỏi mảng");
        int input = sc.nextInt();
        int pos = 0;
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                pos = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Phần tử đã chọn tồn tại trong mảng ở vị trí " + (pos + 1));
            for (int i = pos; i < arr.length; i++) {
                if (pos == arr.length - 1) {
                    arr[pos] = 0;
                } else {
                    arr[i] = arr[i + 1];
                }
            }
            System.out.printf("%-20s%s", "Mảng mới có dạng ", "");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        } else {
            System.out.println("Phần tử nhập vào không tồn tại");
        }

    }
}
