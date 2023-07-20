package ss15_exception.practice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
    /*Tương tự bài trước, ở bài này tham số e - line 25 là một lỗi
    * chưa được xác định, khi xảy ra ngoại lệ thì e sẽ được gọi
    * có thể hiểu, e là một đối tượng của lớp Exception và có
    * phương thức getMessage tùy thuộc vào ngữ cảnh.
    * -> tính đa hình, generic, kế thừa*/
 }
