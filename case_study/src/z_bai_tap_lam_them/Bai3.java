package z_bai_tap_lam_them;

import java.util.ArrayList;

public class Bai3 {
    public static boolean beautifulArray(int[] arr) {
        double total = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if ((sum - arr[i]) == (total - arr[i])/2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3,3};
        int[] c = {1,2,3,4};
        int[] d = {1,99,100,100};
        System.out.println(beautifulArray(a));//false
        System.out.println(beautifulArray(b));//true
        System.out.println(beautifulArray(c));//false
        System.out.println(beautifulArray(d));//true

    }
}
