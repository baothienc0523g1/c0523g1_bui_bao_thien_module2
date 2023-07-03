package ss1_introduction_to_java.practice.src;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        //ở đây dùng kiểu dữ liệu là double vì biến nhập vào kiểu số thực;

        System.out.println("Cân nặng của bạn (đơn vị: kg)");
        weight = scanner.nextDouble();

        System.out.println("Chiều cout của bạn (đơn vị: m");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpetation\n");
        //phương thức \n dùng để xuống dòng;
        if (bmi < 18) {
            System.out.printf("%-20s%s", bmi, "Thiếu cân");
        } else  if (bmi < 25.0) {
            System.out.printf("%-20s%s", bmi, "Cơ thể cân đối");
        } else  if (bmi < 30.0) {
            System.out.printf("%-20s%s", bmi, "Thừa cân");
        } else {
            System.out.printf("%-20s%s", bmi, "Bạn đang có nguy cơ béo phì");
        }
    }
}
