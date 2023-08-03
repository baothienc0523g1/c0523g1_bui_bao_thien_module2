package z_bai_tap;

import java.util.ArrayList;

public class Bai24 {
    public static ArrayList<Long> check(long[] list) {
        ArrayList<Long> myLongArr = convert(list);
        ArrayList<Long> result = new ArrayList<>();
        String[] longString = new String[myLongArr.size()];

        for (int i = 0; i < myLongArr.size(); i++) {
            longString[i] = String.valueOf(myLongArr.get(i));
        }

        for (int i = 0; i < longString.length; i++) {
            Long temp = (long) longString[i].charAt(0);
            if (temp % 2 != 0) {
                result.add(Long.valueOf(longString[i]));
            }
        }
        return result;
    }
    private static ArrayList<Long> convert(long[] list) {
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr1 = {13, 4456, 723424, 234234, 534234};
        long[] arr2 = {22343534, 42312312, 7235345};
        long[] arr3 = {22343534, 42312312, 7235345, 15, 1354323};

        System.out.println(check(arr1));
        System.out.println(check(arr2));
        System.out.println(check(arr3));
    }
}
