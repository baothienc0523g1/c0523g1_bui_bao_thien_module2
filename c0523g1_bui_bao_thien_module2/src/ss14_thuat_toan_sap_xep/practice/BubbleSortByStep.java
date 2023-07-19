package ss14_thuat_toan_sap_xep.practice;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = true;
            for (int i = 0; i < list.length - k; i++) {
                if(list[i] > list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array is sorted and next pass not needed");
                break;
            }
            System.out.println("List after " + k + " step(s) of sort");
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i] + "\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter value at position " + (i + 1));
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");
        }
        bubbleSortByStep(list);
    }
}
