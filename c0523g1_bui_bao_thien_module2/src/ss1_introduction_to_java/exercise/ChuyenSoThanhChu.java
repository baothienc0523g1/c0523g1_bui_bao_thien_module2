package ss1_introduction_to_java.exercise;

import java.sql.Array;
import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number do you want to transfer?");
        int number = sc.nextInt();
        String str = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 1:
                    str = "One";
                    break;
                case 2:
                    str = "Two";
                    break;
                case 3:
                    str = "Three";
                    break;
                case 4:
                    str = "Four";
                    break;
                case 5:
                    str = "Five";
                    break;
                case 6:
                    str = "Six";
                    break;
                case 7:
                    str = "Seven";
                    break;
                case 8:
                    str = "Eight";
                    break;
                case 9:
                    str = "Nine";
                    break;
                case 0:
                    str = "zero";
                    break;
                default:
                    str = "Out of program's ability";
            }
        }
        if (number >= 10 && number <= 15) {
            switch (number) {
                case 10:
                    str = "Ten";
                    break;
                case 11:
                    str = "Eleven";
                    break;
                case 12:
                    str = "Twelve";
                    break;
                case 13:
                    str = "Thirdteen";
                    break;
                case 14:
                    str = "Fourteen";
                    break;
                case 15:
                    str = "Fifteen";
                    break;
                default:
                    str = "Out of program's ability";
            }
        }
        if (number >= 16 && number <= 20) {
            switch (number % 10) {
                case 6:
                    str = "Sixteen";
                    break;
                case 7:
                    str = "Seventeen";
                    break;
                case 8:
                    str = "Eightteen";
                    break;
                case 9:
                    str = "Nineteen";
                    break;
                case 0:
                    str = "Twenty";
                    break;
            }
        }
        if (number >= 20 && number <= 999) {
            str = "";
            int hundreds = number / 100;
            str += Change(hundreds) + " hundreds and ";
            int ten = (number - hundreds * 100) / 10;
            str += Change(ten) + "ty ";
            int ones = number % 10;
            str += Change(ones);
            System.out.println(str);
        }
    }

    public static String Change(int number) {
        String strhun = "";
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    strhun = "";
                    break;
                case 1:
                    strhun = " one";
                    break;
                case 2:
                    strhun = "two";
                    break;
                case 3:
                    strhun = "thir";
                    break;
                case 4:
                    strhun = "four";
                    break;
                case 5:
                    strhun = "five";
                    break;
                case 6:
                    strhun = "six";
                    break;
                case 7:
                    strhun = "seven";
                    break;
                case 8:
                    strhun = "eight";
                    break;
                case 9:
                    strhun = "nine";
                    break;
            }
        }
        return strhun;
    }
}




