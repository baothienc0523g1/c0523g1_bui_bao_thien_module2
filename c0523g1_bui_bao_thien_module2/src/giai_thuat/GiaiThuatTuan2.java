package giai_thuat;

public class GiaiThuatTuan2 {
    boolean solution(int[] a) {
        boolean flag = false;
        int total = 0;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if ((sum - a[i]) == (total - a[i]) / 2) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
