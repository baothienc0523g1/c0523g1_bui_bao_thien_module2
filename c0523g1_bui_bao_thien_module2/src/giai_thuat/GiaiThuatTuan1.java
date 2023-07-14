package giai_thuat;

public class GiaiThuatTuan1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j - i == 5 || j + i == 6) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j - i == 1 || j + i == 10) {
                    System.out.print(5 - i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
