package ss3_array_and_method.practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Long", "Hung", "Lien", "Nam", "Nhat", "Hau", "Hanh"};
        System.out.println("Nhap ten hoc vien muon tim kiem");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Hoc vien nay co trong danh sach, tai vi tri " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay hoc vien " + input + " trong dach sach.");
        }
    }
}
