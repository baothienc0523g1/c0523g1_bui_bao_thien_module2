package ss13_thuat_toan_tim_kiem.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Optional1TimKiemBangDeQuy {
    public static int findValue(List<Integer> arr, int number) {
        int first = 0;
        int last = arr.size() - 1;
        while (last >= first) {
            int mid = (last + first) / 2;
            if (number > arr.get(mid)) {
                first = mid + 1;
            } else if (number == arr.get(mid)) {
                return mid;
            } else if (number < arr.get(mid)) {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bấm số bất kỳ để bắt đầu, 0 để dừng");
            choice = scanner.nextInt();
            if (choice != 0) {
                System.out.print("nhập vào số phần tử của mảng");
                int size = scanner.nextInt();
                List<Integer> arr = new ArrayList<>();
                for (int i = 1; i <= size; i++) {
                    System.out.println("Nhập vào phần tử thứ: " + i);
                    int input = scanner.nextInt();
                    arr.add(input);
                }
                System.out.println("Nhập vào phần tử muốn tìm kiếm");
                int num = scanner.nextInt();
                if (findValue(arr, num) != -1) {
                    System.out.println("Tìm thấy phần tử " + num +
                            " tại index " + findValue(arr, num));
                } else {
                    System.out.println("không tìm thấy " + num + findValue(arr,num));
                }
            } else {
                System.exit(0);
            }
        } while (true);
    }
}
