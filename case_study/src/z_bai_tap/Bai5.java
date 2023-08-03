package z_bai_tap;

public class Bai5 {
    public static void sortByHeight(int [] list) {
        int conditional = -1;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i] && list[j] != conditional) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] i1 = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] i2 = {-1, 150, 165, 170, -1, -1, 160, 180};
        int[] i3 = {-1, 150, -1, 170, -1, -1, 160, 180};
       sortByHeight(i1);
        System.out.println("");
       sortByHeight(i2);
        System.out.println("");
       sortByHeight(i3);
    }
}
