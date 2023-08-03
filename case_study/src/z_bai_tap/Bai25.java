package z_bai_tap;

import java.util.ArrayList;

public class Bai25 {
    public static Double check(double[] list, double number) {
        double result = 0;
        ArrayList<Double> myArr = convert(list);
        double max = myArr.get(0) - number;


        for (int i = 1; i < myArr.size(); i++) {
            double temp = myArr.get(i) - number;
            if (temp > max) {
                max = temp;
            }
        }
        return max - number ;
    }

    private static ArrayList<Double> convert(double[] list) {
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        double[] arr1 = {13.5, 4456.23423423, 723424.12, 534234.432,  234234.1};
        double n1 = 15.5;
        System.out.println(check(arr1, n1));
    }
}

