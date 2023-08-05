package z_bai_tap;

import java.util.ArrayList;

public class Bai8 {
    public static int check(int[] parent, int[] child) {
        ArrayList<Integer> parent1 = convert(parent);
        ArrayList<Integer> child1 = convert(child);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < child1.size(); i++) {
            int count = 0;
            for (int j = 0; j < parent1.size(); j++) {
                if (parent1.get(j) == child1.get(i)) {
                    count++;
                }
            }
            result.add(count);
        }

        int min = result.get(0);
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) < min) {
                min = result.get(i);
            }
        }
        return min;
    }


    private static ArrayList<Integer> convert(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 2, 1};
        int[] arr2 = {1, 2, 3};
        System.out.println(check(arr1, arr2));

        int[] arr3 = {1, 4, 5, 2, 3};
        int[] arr4 = {1, 2, 3};
        System.out.println(check(arr3, arr4));

        int[] arr5 = {1, 4, 5, 2, 3, 1, 2, 3, 1};
        int[] arr6 = {1, 2, 3};
        System.out.println(check(arr5, arr6));

        int[] arr7 = {1, 2, 3};
        int[] arr8 = {1, 1, 1};
        System.out.println(check(arr7, arr8));

    }
}
