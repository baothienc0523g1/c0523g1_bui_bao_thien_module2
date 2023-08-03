package z_bai_tap;

import java.util.ArrayList;

public class Bai14 {

    public static int check(String str) {
        ArrayList<Character> myList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!myList.contains(ch)) {
                myList.add(ch);
            }
        }

        return myList.size();
    }

    public static void main(String[] args) {
        String str1 = "aaaaaa";
        String str2 = "cabca";
        String str3 = "12sdvcs";
        String str4 = "ca";
        String str5 = "cabcde";

        System.out.println("1: " + check(str1));
        System.out.println("3: " + check(str2));
        System.out.println("6: " + check(str3));
        System.out.println("2: " + check(str4));
        System.out.println("5: " + check(str5));


    }
}
