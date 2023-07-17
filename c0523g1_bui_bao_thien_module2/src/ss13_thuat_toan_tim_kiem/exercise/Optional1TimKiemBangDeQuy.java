package ss13_thuat_toan_tim_kiem.exercise;

import java.sql.SQLOutput;
import java.util.*;

public class Optional1TimKiemBangDeQuy implements Comparable {
    public static List<Integer> arr = new ArrayList<>();

    public static List<Integer> summonArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            int input = scanner.nextInt();
            arr.add(input);
            Collections.sort(arr);
        }
        return arr;
    }


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

    @Override
    public int compareTo(Object o) {
        return arr.get(1) - arr.get(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Bấm phím số bất kỳ để bắt đầu, bấm 0 để dừng");
            choice = scanner.nextInt();
            if (choice != 0) {
                List<Integer> arr = summonArr();
                System.out.println("Mảng sau khi sắp xếp theo thứ tự" + arr);
                System.out.println("Nhập vào phần tử muốn tìm kiếm");
                int num = scanner.nextInt();
                if (findValue(arr, num) != -1) {
                    System.out.println("Tìm thấy phần tử " + num +
                            " tại index " + findValue(arr, num));
                } else {
                    System.out.println("không tìm thấy " + num);
                }
            } else {
                System.exit(0);
            }
        }
        while (true);

    }
}
