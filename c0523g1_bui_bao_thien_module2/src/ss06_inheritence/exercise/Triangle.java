package ss06_inheritence.exercise;

import ss06_inheritence.practice.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    protected static boolean flag;
    private double side1;
    private double side2;
    private double side3;
    private String color;
    public Triangle() {
        flag = true;
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
        this.color = "blue";
    }
    public Triangle(double s1, double s2, double s3) {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            flag = true;
        } if (flag) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
            this.color = "blue";
        } else {
            flag = false;
        }
    }
    public Triangle(double s1, double s2, double s3, String color) {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            flag = true;
        } if (flag) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
            this.color = color;
        }
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSide1(double s1) {
        this.side1 = s1;
    }
    public void setSide2(double s2) {
        this.side2 = s2;
    }
    public void setSide3(double s3) {
        this.side3 = s3;
    }
    public double getArea() {
        return this.side1 + this.side2 + this.side3;
    }
    public double getHeight() {
        double p = (getArea() / 2);
        return (2 * (Math.pow(p * (p - this.side1) * (p - this.side2) * (p - this.side3), 0.5))) / this.side1;
    }
    public double getPerimeter() {
        return (this.side1 * getHeight()) / 2;
    }
    public String toString() {
        if (flag == true) {
            return "Một tam giác có ba cạnh là = " + side1 + ", "
                    + side2 + ", " + side3 + " và có màu "
                    + color + " với chiều cao từ đỉnh A, "
                    + "diện tích, chu vi lần lượt là: "
                    + getHeight() + ", "
                    + getPerimeter() + ", "
                    + getArea()
                    + ". Tam giác này là lớp con của " + super.toString();
        } else {
            return "Ba cạnh này không thể hợp thành tam giác";
        }
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        do  {
            System.out.println("Bấm phím bất kỳ để chạy chương trình," +
                    "bấm 0 để thoát.");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("STOPPED!");
            } else {
                    //nhập vào 1 tam giác từ bàn phím và thực hiện việc tính thông số;
                    System.out.println("Nhập vào cạnh A");
                    triangle.setSide1(sc.nextDouble());
                    System.out.println("Nhập vào cạnh B");
                    triangle.setSide2(sc.nextDouble());
                    System.out.println("Nhập vào cạnh C");
                    triangle.setSide3(sc.nextDouble());
                    System.out.println(triangle.toString());
                }
            } while (choice != 0);
        }
    }
