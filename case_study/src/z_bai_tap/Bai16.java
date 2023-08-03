package z_bai_tap;

import java.util.ArrayList;

public class Bai16 {
    private static ArrayList<Integer> convert(int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }
    public static ArrayList<Integer> check(int[] list) {
        ArrayList<Integer> input = convert(list);
        ArrayList<Integer> result = new ArrayList<>();
            int temp= 0;

        for (int i = 0; i < input.size(); i++) {
            temp += input.get(i);
            result.add(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 5};
        int[] arr3 = {1, 5, 7};
        int[] arr4 = {1, 2, 3, 4, 0};
        System.out.println(check(arr1));
        System.out.println(check(arr2));
        System.out.println(check(arr3));
        System.out.println(check(arr4));
    }
}
