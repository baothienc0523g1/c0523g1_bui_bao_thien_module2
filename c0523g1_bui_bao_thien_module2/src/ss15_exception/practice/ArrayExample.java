package ss15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[30];
        System.out.println("List of elements: ");
        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(30);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random index between 0 to 29");
        int index = scanner.nextInt();
        try {
            System.out.println("Value of the element have index " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of array list");
        }
    }
    /*Mục đích của bài này là cố gắng catch 1 ngoại lệ khi người dùng
    * nhập vào index vượt quá index của mảng. Nếu không có try-catch thì
    * Java sẽ hiện ra lỗi IndexOutOfBoundsExcrption, nhưng ở đây ta catch
    * trước lỗi đó, khi gặp thì thay vì hiện ra IndexOutOfBoundsExcrption và
    * gây chết chương trình thì ta sout ra, và ctrinh có thể chạy tiếp*/
}
