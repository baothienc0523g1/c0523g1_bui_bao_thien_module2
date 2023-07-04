package ss2_loop.exercise;

public class HienThiSNT {
    //hien thi 20 so nguyen to dau tien
    public static void main(String[] args) {
        int soLuongSNT = 1;
        int i = 3;

        while (soLuongSNT <= 20) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println("so thu " + soLuongSNT + " " +i);
                soLuongSNT += 1;
            }
            i++;
        }
    }
}
