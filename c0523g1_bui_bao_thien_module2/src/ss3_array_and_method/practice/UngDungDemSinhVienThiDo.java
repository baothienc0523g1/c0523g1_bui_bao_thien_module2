package ss3_array_and_method.practice;

import java.util.Scanner;

public class UngDungDemSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int students[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("How many students do you wanna check?");
            size = sc.nextInt();
            if (size <= 0 || size >= 30) {
                System.out.println("Size is invalid, better smaller than 30 and greater than 0");
            }
        } while (size <= 0 || size >= 30);
        students = new int[size];
        int i = 0;
        while (i < students.length) {
            System.out.print("Enter a mark for studen " + (i + 1) + ": ");
            students[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < students.length; j++) {
            System.out.print(students[j] + "\t");
            if (students[j] >= 5 && students[j] <= 10) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is: " + count);
    }
}
