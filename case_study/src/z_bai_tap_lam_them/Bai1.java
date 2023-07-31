package z_bai_tap_lam_them;

import java.util.ArrayList;

public class Bai1 {
    public static boolean checkEqualFrequency(int[] list) {
        boolean flag = true;
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();
        if (list.length == 1) {
            flag = false;
        }

        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            if (!myList.contains(temp)) {
                myList.add(list[i]);
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (myList.get(i) == list[j]) {
                    count++;
                }
            }
                countList.add(count);
        }

        for (int i = 0; i < countList.size() - 1; i++) {
            if (countList.get(i) != countList.get(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] s1 = {1, 2, 2, 1};
        int[] s2 = {1, 2, 2, 3, 1, 3, 1, 3};
        int[] s3 = {4, 3, 2, 1, 4, 2, 3, 1, 1};
        int[] s4 = {4, 3, 2, 1, 4, 2, 3, 1};
        int[] s5 = {100};
        System.out.println("s1: " + checkEqualFrequency(s1));
        System.out.println("s2: " + checkEqualFrequency(s2));
        System.out.println("s3: " + checkEqualFrequency(s3));
        System.out.println("s4: " + checkEqualFrequency(s4));
        System.out.println("s5: " + checkEqualFrequency(s5));

    }
}
