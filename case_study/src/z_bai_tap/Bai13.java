package z_bai_tap;

import java.util.ArrayList;
import java.util.Collections;

public class Bai13 {
    public static int check(int[] input) {
        ArrayList<Integer> list = convert(input);
        ArrayList<Integer> change = new ArrayList<>();
        int result = 0;
        int max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            change.add(temp);
        }


        Collections.sort(list);
        int index = list.get(list.size() - 2);

        result = change.indexOf(index);
        if (isEquals(change)) {
            return result;
        } else {
            return -1;
        }
    }

    private static ArrayList<Integer> convert(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    private static boolean isEquals(ArrayList<Integer> list) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int temp1 = list.get(i);
            int temp2 = list.get(i + 1);
            if (temp1 == temp2) {
                count++;
            }
        }
        if (count >= list.size() / 2) {
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 3, 6, 1, 5, 4};
        int[] arr2 = {8, 3, 4, 1, 5, 4};
        int[] arr3 = {8, 8, 8, 8, 8};
        int[] arr4 = {8, 3, 6, 1, 5, 4, 7};

        System.out.println(check(arr1));
        System.out.println(check(arr2));
        System.out.println(check(arr3));
        System.out.println(check(arr4));

    }
}
