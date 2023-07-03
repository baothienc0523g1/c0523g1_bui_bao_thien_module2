package ss1_introduction_to_java.exercise;

import  java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Gia tri VND: " + quyDoi + " VND");
    }
}
