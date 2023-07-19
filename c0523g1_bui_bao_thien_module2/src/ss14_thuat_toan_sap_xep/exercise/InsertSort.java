package ss14_thuat_toan_sap_xep.exercise;

public class InsertSort {
    static int[] list = {1, 3, 2, 5, 45, 8, 21, 5, -1, -55};

    public static void insertSorted(int[] list) {
        int pos, current;
        for (int i = 1; i < list.length; i++) {
            current = list[i];
            System.out.print("index = " + i + " current = " + current);
            pos = i;
            System.out.println(", phần tử (pos - 1) = " + list[pos - 1]);
            System.out.print(", pos = " + i);
            while (pos > 0 && current < list[pos - 1]) {

                System.out.print(", vào while pos = " + pos + ", đổi chỗ " + list[pos]);
                list[pos] = list[pos - 1];
                System.out.print(" cho " + list[pos - 1]);
                pos--;
                System.out.println(", pos = " + pos);
            }
            list[pos] = current;
            System.out.println(", ra khỏi while, pos = " + pos);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        insertSorted(list);
    }
}
