package ss3_array_and_method.practice;

import java.util.Scanner;

public class TimGTLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        do{
            System.out.println("Bạn muốn so sánh tài sản của bao nhiêu tỉ phú");
            count = sc.nextInt();
            if (count <= 1 || count >= 20) {
                System.out.println("Số liệu phải lớn hơn 2 hoặc nhỏ hơn 20 để tiến hành so sánh, vui lòng nhập lại");
            }
        }
        while(count <= 1 || count >= 20);

       int[] netWorth;
       netWorth = new int[count];

        for (int i = 0; i < netWorth.length; i++) {
            System.out.println("Nhập số liệu vị trí thứ " + (i+1));
            netWorth[i] = sc.nextInt();
        }
        System.out.printf("%%-20s%s", "Thông số nhập vào: ", "");
        for (int i = 0; i < netWorth.length; i++) {
            System.out.printf(netWorth[i] + "\t");
        }

        int max = netWorth[0];
        int position = 0;
        for (int i = 1; i < netWorth.length; i++) {
            if (netWorth[i] > max) {
                max = netWorth[i];
                position = i + 1;
            }
        }
        System.out.println("Số liệu lớn nhất là: " + max + " tại vị trí: " + position);
            }
}
