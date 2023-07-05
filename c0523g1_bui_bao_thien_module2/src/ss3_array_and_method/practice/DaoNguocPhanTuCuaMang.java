package ss3_array_and_method.practice;

import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size >= 20 || size <= 0) {
                System.out.println("Size is invalid");
            }
        } while (size >= 20 || size <= 0);
        array = new int[size];
        // mảng array có dạng số nguyên, có "size" phần tử
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element at " + (i + 1));
            array[i] = sc.nextInt();
            i++;
        }
        //in ra mảng đã nhập, dùng printf để hiển thị đúng định dạng của mảng
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            //"t" là kiểu dữ liệu string, 't' là kiểu dữ liệu char;
            System.out.print(array[j] + "\t");
        }
        //đảo ngược phần tử.
        int first = 0;
        int last = array.length-1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.printf("\n%-20s%s", "Array after reverse: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

