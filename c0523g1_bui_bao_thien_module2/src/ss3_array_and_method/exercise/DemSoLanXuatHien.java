package ss3_array_and_method.exercise;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chuỗi ký tự");
        String str = sc.nextLine();
        System.out.println("Mảng ký tự gốc là: " + str);
        System.out.println("Nhập vào một ký tự để kiểm tra sự xuất hiện: ");
        char input = sc.next().charAt(0);
        System.out.println("Ký tự nhập vào là: " + input);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (input == str.charAt(i)) {
                count++;
            }
        }
            System.out.println(count);
    }
}
