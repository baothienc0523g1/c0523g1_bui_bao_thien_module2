package ss3_array_and_method.practice;

public class TimSoNhoNhat {
    //bài này sử dụng phương thức để tìm số nhỏ nhất;
    //phương thức có đặc điểm gần giống với function ở js;
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        //cài đặt nguyên mẫu cho phương thức, xem kỹ line 5;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất là " + arr[index]);
    }
}

