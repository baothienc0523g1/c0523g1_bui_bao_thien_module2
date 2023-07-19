package ss13_thuat_toan_tim_kiem.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxValueOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string");
        String string = input.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                }
            }
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
            tempList.clear();
        }
        for (Character ch : maxList) {
            System.out.print(ch);
        }
    }
    /*Độ phức tạp:
    * line 9->12: 1
    * line 14 > 27: n (= string.length)
    * line 28: n (= maxList.length)
    * -> O(n)*/
}
