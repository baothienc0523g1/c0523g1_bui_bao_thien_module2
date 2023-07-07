package ss3_array_and_method.exercise;

import java.util.Scanner;

public class PhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = -1;
        while (size <= 0) {
            System.out.println("Enter array's size");
            size = sc.nextInt();
            if (size <= 0) {
                System.out.println("Array's size is invalid");
            }
        }
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at position " + (i + 1) + ": ");
            int input = sc.nextInt();
            arr[i] = input;
        }
        System.out.printf("%-20s%s","Array entered: ","");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
        int minElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        System.out.println("The smallest element in array is: " + minElement);
    }
}
