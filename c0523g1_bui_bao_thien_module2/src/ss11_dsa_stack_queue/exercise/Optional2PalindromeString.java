package ss11_dsa_stack_queue.exercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public final class Optional2PalindromeString {
    public static void checkPalindrome(String string) {
        Queue<Character> firstHalfString = new LinkedList<>();
        Stack<Character> secondHalfString = new Stack<>();
        String result = "";
        String converseString = string.replaceAll(" ","").toLowerCase();
        int halfLength = converseString.length() / 2;

        for (int i = 0; i <= halfLength; i++) {
            firstHalfString.add(converseString.charAt(i));
        }
        for (int i = converseString.length() - 1; i >= halfLength; i--) {
            secondHalfString.push(converseString.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < halfLength; i++) {
            if (firstHalfString.remove(secondHalfString.get(i)))
                count++;
        }

        String correct = "This is a palindrome string";
        String incorrect = "This is NOT a palindrome string";
        result += (count == halfLength) ? correct : incorrect;
        System.out.println(result);
    }

    public static void main(String[] args) {
        String test1 = "abccba  ";
        String test2 = "Able was I ere I saw Elba  ";
        String test3 = "abccba aaa  ";

        checkPalindrome(test1);
        checkPalindrome(test2);
        checkPalindrome(test3);
    }
}
