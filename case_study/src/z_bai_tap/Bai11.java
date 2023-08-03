package z_bai_tap;

public class Bai11 {
    public static int check(int buy, int get, int total) {
        int buyAndGet = buy + get;

        int mod = total % buyAndGet;
        int conditional = Math.floorDiv(total, buyAndGet);

        int result1 = buy * conditional + mod;
        int result2 = buy * (conditional + 1);

        if (result1 < result2) {
            return result1;
        } else {
            return result2;
        }

    }

    public static void main(String[] args) {
        System.out.println(check(2, 1, 6));//4
        System.out.println(check(3, 2, 11));//7
        System.out.println(check(3, 2, 5));//3
        System.out.println(check(4, 2, 11));//8
        System.out.println(check(5, 2, 10));//8
    }
}
