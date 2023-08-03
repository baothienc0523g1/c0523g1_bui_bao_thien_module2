package z_bai_tap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bai20 {
    public static ArrayList<String> sort(String str) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> lengthOfString = new ArrayList<>();
        String[] input = str.split(",");
        for (int i = 0; i < input.length; i++) {
            String temp = input[i];
            if (!lengthOfString.contains(temp.length())) {
                lengthOfString.add(temp.length());
            }
        }
        Collections.sort(lengthOfString);

        for (int i = 0; i < lengthOfString.size(); i++) {
            int length = lengthOfString.get(i);
            for (int j = 0; j < input.length; j++) {
                String temp = input[j];
                if (temp.length() == length) {
                    result.add(temp);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s1 = "abc, ,aaa,a,zz";
        String s2 = "abc,b,aaa,a,zz";
        String s3 = "abc, ,aaa,a,zz,123";
        String s4 = "abc, ,aa,a,zz";
        System.out.println(sort(s1));
        System.out.println(sort(s2));
        System.out.println(sort(s3));
        System.out.println(sort(s4));
    }
}
