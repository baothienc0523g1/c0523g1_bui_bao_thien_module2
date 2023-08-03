package z_bai_tap;

import java.util.ArrayList;

public class Bai18 {
    public static ArrayList<Integer> myAdd(int[] list) {
        ArrayList<Integer> myArr = convert(list);
        ArrayList<Integer> result = new ArrayList<>();

        int min = myArr.get(0);
        int max = myArr.get(0);
        for (int i = 0; i < myArr.size(); i++) {
            if (myArr.get(i) > max) {
                max = myArr.get(i);
            }
            if (myArr.get(i) < min) {
                min = myArr.get(i);
            }
        }
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        result.removeAll(myArr);
        return result;
    }

    private static ArrayList<Integer> convert(int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 3, 8};
        int[] arr2 = {6, 2, 3, 8, 10};
        int[] arr3 = {6, 1, 3, 8, 11};
        int[] arr4 = {6, 11};
        int[] arr5 = {2, 3, 8};
        System.out.println(myAdd(arr1));
        System.out.println(myAdd(arr2));
        System.out.println(myAdd(arr3));
        System.out.println(myAdd(arr4));
        System.out.println(myAdd(arr5));
    }
}
