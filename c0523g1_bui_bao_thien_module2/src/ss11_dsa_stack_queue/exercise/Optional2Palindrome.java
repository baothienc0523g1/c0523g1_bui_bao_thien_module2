package ss11_dsa_stack_queue.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public final class Optional2Palindrome extends MyQueueArrayList {
    public static void checkPalindrome(String string) {
        String result = "";
        ArrayList<Character> firstHalfString = new ArrayList<>();
        ArrayList<Character> secondHalfString = new ArrayList<>();

        String converseString = string.replaceAll(" ","").toLowerCase();
        int halfLength = converseString.length()/2;

        for (int i = 0; i <= halfLength; i++) {
            firstHalfString.add(converseString.charAt(i));
        }
        for (int j = converseString.length() - 1; j >= halfLength; j--) {
            secondHalfString.add(converseString.charAt(j));
        }

        int count = 0;
        for (int k = 0; k < halfLength; k++) {
            if (firstHalfString.get(k).equals(secondHalfString.get(k))) {
                count++;
            }
        }
        String correct = "This is a palindrome string";
        String incorrect = "This is NOT a palindrome string";
        result += (count == halfLength) ? correct : incorrect;
        System.out.println(result);
    }
    public static void main(String[] args) {
        String test1 = "Able was I ere I saw Elba";
        String test2 = "abc bcd def";
        String test3 = "que euq que euq";
        checkPalindrome(test1);
        checkPalindrome(test2);
        checkPalindrome(test3);
    }

}
