package ss1_introduction_to_java.practice.src;//gói: là một nhóm các kiểu tương tự của các lớp, giao diện và các
//package con. Package này được người dùng định nghĩa;
//package khắc phục đc việc trùng tên class. Có thể được dựng sẵn
// hoặc được người dùng định nghĩa;

import java.util.Scanner;
//xác định các phương thức Scanner trong lớp Scanner;

public class TinhSoNgayTrongThang {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //lấy dữ liệu người dùng nhập vào(system.in), gán cho scanner,
        // còn scanner là một object từ lớp Scanner'

        System.out.println("Bạn muốn xem số ngày của tháng nào?");
        //hiển thị thông báo mô tả cho người dùng nhập vào đúng kiểu dữ liệu
        int month = scanner.nextInt();
        //gán biến month kiểu int;

        switch (month) {
            case 2:
                System.out.print("Tháng 2 có 28 học 29 ngày.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + " có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng " + month + " có 30 ngày.");
                break;
            default:
                System.out.print("Thông số nhập vào không hợp lệ.");
                break;
        }
    }
}
