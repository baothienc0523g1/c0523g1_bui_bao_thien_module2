package z_bai_tap;

import java.util.ArrayList;
import java.util.Collections;

public class Bai17 {
    public static boolean check(String s1, String s2) {
        boolean flag = true;
        ArrayList<Integer> str1 = new ArrayList<>();
        ArrayList<Integer> str2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            str1.add((int) s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            str2.add((int) s2.charAt(i));
        }
        Collections.sort(str1);
        Collections.sort(str2);

        if (str1.size() != str2.size()) {
            flag = false;
        } else {
            for (int i = 0; i < str1.size(); i++) {
                int temp1 = str1.get(i);
                int temp2 = str2.get(i);
                if (temp1 != temp2) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s1 = "abcd"; //true
        String s2 = "cbad";
        System.out.println(check(s1, s2));

        String s3 = "abcc";//false
        String s4 = "bcd";
        System.out.println(check(s3, s4));

        String s5 = "abcc";//true
        String s6 = "bcac";
        System.out.println(check(s5, s6));

        String s7 = "Ab123";//false
        String s8 = "23ba1";
        System.out.println(check(s7, s8));

    }
}
