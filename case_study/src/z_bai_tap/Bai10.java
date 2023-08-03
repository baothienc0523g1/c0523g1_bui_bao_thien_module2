package z_bai_tap;

import java.util.ArrayList;

public class Bai10 {
    public static int washMoney(int[] list, int num) {
        ArrayList<Integer> arrayList = convert(list);
        int sum = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        int result = num - sum;

        if (result > num) {
            return result;
        } else {
            return num;
        }
    }


    public static ArrayList<Integer> convert(int[] list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 7};
        int num1 = 4;
        System.out.println(washMoney(arr1, num1));//8

        int[] arr2 = {3, 2, 1};
        int num2 = 10;
        System.out.println(washMoney(arr2, num2));//10

        int[] arr3 = {3, 2, 1, 8};
        int num3 = 5;
        System.out.println(washMoney(arr3, num3));//12

        int[] arr4 = {3, 5, 2, 7, 1};
        int num4 = 7;
        System.out.println(washMoney(arr4, num4));//7
    }
}
