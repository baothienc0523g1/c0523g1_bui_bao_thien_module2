package z_bai_tap_lam_them;

import java.util.ArrayList;

public class Bai8 {
    public static int check(int[] parent, int[] child) {
        ArrayList<Integer> parent1 = convert(parent);
        ArrayList<Integer> child1 = convert(child);

        int count = 0;
        for (int j = 0; j < child1.size(); j++) {
            if (parent1.contains(child1.get(j))) {
                count++;
                continue;
            }
        }
        return count / child1.size();
    }

    private static ArrayList<Integer> convert(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 2, 1};
        int[] arr2 = {1, 2, 3};
        System.out.println(check(arr1, arr2));

        int[] arr3 = {1, 4, 5, 2, 3};
        int[] arr4 = {1, 2, 3};
        System.out.println(check(arr3, arr4));

        int[] arr5 = {1, 4, 5, 2, 3, 2, 3, 8};
        int[] arr6 = {1, 2, 3};
        System.out.println(check(arr5, arr6));

        int[] arr7 = {1, 2, 3};
        int[] arr8 = {1, 1, 1};
        System.out.println(check(arr7, arr8));

    }
}
