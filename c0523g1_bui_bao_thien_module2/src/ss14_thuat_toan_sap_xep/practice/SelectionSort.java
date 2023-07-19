package ss14_thuat_toan_sap_xep.practice;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
    /*tìm phần tử nhỏ nhất trong list từ đầu -> cuối*/
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                /*nếu vị trí bé k trùng với i thì tiến hành đổi chỗ*/
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double e : list) {
            System.out.println(e + "\t");
        }
    }
}
