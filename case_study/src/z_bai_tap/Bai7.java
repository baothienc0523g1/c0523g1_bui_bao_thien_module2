package z_bai_tap;

import java.util.ArrayList;
import java.util.Collections;

public class Bai7 {
    public static ArrayList<Integer> primeList(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            for (int j = 0; j < temp.length; j++) {
                if (isPrime(temp[j]) && temp[j] >= 2) {
                    list.add(temp[j]);
                }
            }
        }
        Collections.sort(list);
        ;
        return convert(list);
    }
    protected static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    protected static ArrayList<Integer> convert(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (!result.contains(temp)) {
                result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] myArr = {
                {1, 2, 8, 43},
                {9, 4, 11, 7},
                {11, 6, 4, 0},
                {1, 2, 6, 51},
        };
        System.out.println(primeList(myArr));
    }
}
