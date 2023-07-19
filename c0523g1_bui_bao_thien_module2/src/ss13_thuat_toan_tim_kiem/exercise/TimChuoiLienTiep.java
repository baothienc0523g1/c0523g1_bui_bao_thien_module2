package ss13_thuat_toan_tim_kiem.exercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class TimChuoiLienTiep {
    public static void longestString(String string) {
        LinkedList<Character> myList = new LinkedList<>();
        LinkedList<Character> maxList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            if (myList.size() > 1
                    && string.charAt(i) <= myList.getLast()
                    && myList.contains(string.charAt(i))) {
                myList.clear();
            }
            myList.add(string.charAt(i));
            if (myList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(myList);
            }
        }
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
    /*Độ phức tạp:
    * Line 9, 10: 1
    * line 12 -> 23: n (= string.length)
    * line 24: n (= maxList.length)
    * O = n + n + 1 = n
    * -> O(n) */

    public static void main(String[] args) {
        String string = "abcabcdgabxy";
        longestString(string);
        //abcdg
    }
}
