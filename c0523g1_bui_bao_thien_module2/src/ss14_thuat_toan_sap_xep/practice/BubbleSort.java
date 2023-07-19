package ss14_thuat_toan_sap_xep.practice;

public class BubbleSort {
    static int[] list = {2,3,5,7,1,-23,-52,9,11};
    public static void bubbleSortedList(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSortedList(list);
        for (int list1: list) {
            System.out.println(list1);
        }
    }
}
