package z_bai_tap;

import java.util.ArrayList;

public class Bai22 {
    public static boolean isPrime(int input) {
        boolean flag = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static ArrayList<Integer> check(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                result.add(i);
                result.add(number - i);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check(24));
    }
}
