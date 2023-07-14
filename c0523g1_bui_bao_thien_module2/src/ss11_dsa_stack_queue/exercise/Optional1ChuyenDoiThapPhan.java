package ss11_dsa_stack_queue.exercise;


import java.util.ArrayList;

public class Optional1ChuyenDoiThapPhan extends ArrayList {
   public static String binaryRead(int number) {
       String result = "";
       MyStackArrayList<Integer> binaryArray = new MyStackArrayList<>();

       int modulus;
       while(number > 0) {
           modulus = number % 2;
           binaryArray.push(modulus);
           number /= 2;
       }
       int size = binaryArray.size();
       for (int i = 0; i < size; i++) {
           result += binaryArray.pop();
       }
       return result;
   }

    public static void main(String[] args) {
        System.out.println(binaryRead(30));
        System.out.println(binaryRead(100));
        System.out.println(binaryRead(130));
    }
}
