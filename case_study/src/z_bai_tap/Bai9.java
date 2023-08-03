package z_bai_tap;

public class Bai9 {
    public static int check(int num1, int num2) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            int temp1 = i / 10;
            int temp2 = i % 10;
            if (temp1 == temp2 || (i > 0 && i < 10)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(check(9,13));
        System.out.println(check(10,100));
        System.out.println(check(10,30));
        System.out.println(check(10,20));
    }
}
