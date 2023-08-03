package z_bai_tap;

import java.util.ArrayList;

public class Bai23 {
    public static boolean check(int[] list) {
        boolean flag = true;
        ArrayList<Integer> myArr = convert(list);
        int cons = myArr.get(0) - myArr.get(1);

        for (int i = 0; i < myArr.size() - 1; i++) {
            int temp = myArr.get(i) - myArr.get(i + 1);
            if (temp != cons) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    private static ArrayList<Integer> convert(int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,7};//true
        int[] arr2 = {1,5,7};//false
        int[] arr3 = {1,5,9,13};//true
        int[] arr4 = {0,4,8,11};//false

        System.out.println(check(arr1));
        System.out.println(check(arr2));
        System.out.println(check(arr3));
        System.out.println(check(arr4));
    }
}
