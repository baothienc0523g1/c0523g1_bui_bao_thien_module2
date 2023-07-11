package ss09_tdd.exercise;

public class TriangleClassifier {
    public static String triangleClassifier(double side1, double side2, double side3) {
        String result = "";
        double side1and2 = side1 + side2;
        double side1and3 = side1 + side3;
        double side2and3 = side2 + side3;
        double conditional = side1 * side2 * side3;

        if (conditional <= 0) {
            return result += "Canh cua tam giac phai > 0";
        } else if (side1and3 <= side2 || side1and2 <= side3 || side2and3 <= side1) {
            return result += "Khong phai la ba canh cua mot tam giac";
        } else if (side1 == side2 && side1and2 > side3 && side2 != side3) {
            return result += "Tam giac can";
        } else if (side3 == side2 && side2and3 > side1 && side3 != side1) {
            return result += "Tam giac can";
        } else if (side1 == side3 && side1and3 > side2 && side1 != side2) {
            return result += "Tam giac can";
        } else if (side1 == side2 && side1 == side3) {
            return result += "Tam giac deu";
        } else
            return result += "Tam giac thuong";
    }
}

