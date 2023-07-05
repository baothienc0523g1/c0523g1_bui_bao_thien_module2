package ss3_array_and_method.exercise;

public class GopMang {
    public static void main(String[] args) {
        int arrayA[] = {1, 2, 3, 4};
        int arrayB[] = {5, 6, 7, 8};
        int resultArray[] = new int[arrayA.length + arrayB.length];

        System.out.printf("%-20s%s","Mảng A có dạng: ","");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + "\t");
        }
        System.out.println("");
        System.out.printf("%-20s%s","Mảng B có dạng: ", "");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + "\t");
        }
        System.out.println("");

        for (int i = 0; i < arrayA.length; i++) {
            resultArray[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            resultArray[resultArray.length - arrayA.length + i] = arrayB[i];
        }
        System.out.printf("%-20s%s","Mảng C có dạng: ", "");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + "\t");
        }
    }
}
