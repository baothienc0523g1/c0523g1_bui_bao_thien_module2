package z_bai_tap;

public class Bai21 {
    public static int getNum(int number) {
        int result = 0;
        int digit = 1;
        for (int i = 1; i <= number; i++) {
            digit *= i;
        }
        String n = String.valueOf((Integer) digit);
        String[] n2 = n.split("");
        for (int i = n2.length - 1; i > 0; i--) {
            if (!n2[i].equals("0")) {
                result = Integer.parseInt(n2[i]);
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n1 = 5;//2
        int n2 = 6;//2
        int n3 = 10;//8
        int n4 = 8;//2
        int n5 = 12;//6
        System.out.println(getNum(n1));
        System.out.println(getNum(n2));
        System.out.println(getNum(n3));
        System.out.println(getNum(n4));
        System.out.println(getNum(n5));
    }
}
