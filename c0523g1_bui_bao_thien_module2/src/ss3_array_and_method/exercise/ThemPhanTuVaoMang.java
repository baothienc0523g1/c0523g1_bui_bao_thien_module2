package ss3_array_and_method.exercise;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int pos = -1;
        int num = 0;

        while (pos <= -1 || pos >= (array.length - 1)) {
            System.out.println("Vui lòng nhập vào vị trí và phần tử (kiểu số nguyên) muốn thêm vào mảng");
            System.out.println("Nhập vị trí muốn thêm");
            pos = sc.nextInt();
            if (pos <= -1 || pos >= (array.length - 1)) {
                System.out.println("Vị trí muốn thay thế vượt quá số phần tử của mảng");
            }
            System.out.println("Nhập phần tử muốn thêm");
            num = sc.nextInt();

            for (int i = array.length - 1; i > pos; i--) {
                array[i] = array[(i - 1)];
            }
            array[pos] = num;

            System.out.printf("%-20s%s", "Mảng sau khi thay đổi có dạng: ", "");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
