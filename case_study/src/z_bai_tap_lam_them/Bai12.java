package z_bai_tap_lam_them;

import java.util.ArrayList;

public class Bai12 {
    public static int taxi(int[] list) {
        ArrayList<Integer> myArr = convert(list);
        int taxiCount = 0;

        for (int i = 0; i < myArr.size(); i++) {
            if (myArr.get(i) == 4) {
                myArr.remove(i);
                taxiCount++;
            } else {
                for (int j = i + 1; j < myArr.size(); j++) {
                    int temp = myArr.get(i) + myArr.get(j);
                    if (temp <= 4) {
                        taxiCount++;
                        myArr.remove(i);
                        myArr.remove(j);
                    }
                }
            }
        }
        return myArr.size() + taxiCount;
    }

    private static ArrayList<Integer> convert(int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 3, 3}; //4
        int[] arr2 = {1, 2, 4, 2, 3}; //3
        int[] arr3 = {4, 2, 4, 3, 3}; //5
        int[] arr4 = {1, 2, 4, 3, 1, 2}; //4
        int[] arr5 = {2, 2, 4, 3, 2, 3}; //5

        System.out.println(taxi(arr1));
        System.out.println(taxi(arr2));
        System.out.println(taxi(arr3));
        System.out.println(taxi(arr4));
        System.out.println(taxi(arr5));
    }
}
