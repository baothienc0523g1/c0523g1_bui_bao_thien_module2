package ss2_loop.exercise;

import java.util.Scanner;

public class HienThiSNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
