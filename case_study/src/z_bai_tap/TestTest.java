package z_bai_tap;

import java.util.*;

public class TestTest {
    public static boolean containsDuplicate(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};//true
        int[] b = {1, 2, 3, 4}; //false
        int[] c = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}; //true
        int[] d = {1}; //false
        System.out.println(containsDuplicate(a));
        System.out.println(containsDuplicate(b));
        System.out.println(containsDuplicate(c));
        System.out.println(containsDuplicate(d));
    }
}
