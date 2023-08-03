package z_bai_tap;

import java.util.ArrayList;

public class Bai2 {
    public static ArrayList<Character> myCheckList(String s1, String s2) {
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> temp1 = myTransfer(s1);
        ArrayList<Character> temp2 = myTransfer(s2);

        for (int i = 0; i < temp1.size(); i++) {
            Character ch1 = temp1.get(i);
            for (int j = 0; j < temp2.size(); j++) {
                Character ch2 = temp2.get(j);
                if (ch2 == ch1) {
                    result.add(ch1);
                    temp2.remove(temp2.get(j));
                    break;
                }
            }
        }
        return result;
    }

    private static ArrayList<Character> myTransfer(String s) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println("s1+s2: " + myCheckList(s1, s2).size());//3

        String s3 = "Abcdef";
        String s4 = "Adghjklbc";
        System.out.println("s3+s4: " + myCheckList(s3, s4));//4

        String s5 = "Abcdef1234";
        String s6 = "Uykhldg1";
        System.out.println("s5+s6: " + myCheckList(s5, s6));//2

        String s7 = "Abc";
        String s8 = "ade";
        System.out.println("s7+s8: " + myCheckList(s7, s8));//0

    }
}
