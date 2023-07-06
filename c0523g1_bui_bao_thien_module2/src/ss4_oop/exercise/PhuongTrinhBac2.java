package ss4_oop.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
//khai báo lớp pt bậc 2 chứa các phương thức
public class PhuongTrinhBac2 {
    double a, b, c;
    public PhuongTrinhBac2() {
    }
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }
    public String getRoot() {
        getDiscriminant();
        if (getDiscriminant() < 0) {
            return " vo nghiem vi Delta < 0";
        } else if (getDiscriminant() == 0) {
            double root = - this.b/(this. a * 2);
            return " co nghiem kep: " + root;
        } else {
            double root1, root2;
            root1 = (-this.b - Math.pow((getDiscriminant() - 4 * a * c), 2));
            root2 = (-this.b + Math.pow((getDiscriminant() - 4 * a * c), 2));
            return " co 2 nghiem phan biet: " + root1 + root2;
        }
    }
    public String getInfor() {
        return "Phuong trinh bac 2 co dang: " + a + "^2.x " + b + "x " + c;
    }
    public static void main(String[] args) {
        //khởi tạo đối tượng pTrinh từ lớp PhuongTrinhBac2 trong main với
        // a b c đc nhập vào từ bàn phím;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap co so A: ");
        double a = sc.nextDouble();
        System.out.print("Nhap co so B: ");
        double b = sc.nextDouble();
        System.out.print("Nhap co so C: ");
        double c = sc.nextDouble();
        PhuongTrinhBac2 pTrinh = new PhuongTrinhBac2( a,  b,  c);
        //gọi phương thức getinfor của đối tượng pTrinh;
        System.out.print(pTrinh.getInfor());
        System.out.println("Delta " + pTrinh.getDiscriminant());
        System.out.println("Phuong trinh " + pTrinh.getRoot());
    }
}

