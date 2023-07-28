package giai_thuat;

import java.util.*;

public class Test {
    public static boolean areBracketsBalanced(String str) {
        //Your code here
        Stack<Character> stack = new Stack<>();

        for (Character ch : str.toCharArray()) {
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{{{{}";
        String str2 = "{}()";
        String str3 = "{[()]}";
        System.out.println(areBracketsBalanced(str));
        System.out.println(areBracketsBalanced(str2));
        System.out.println(areBracketsBalanced(str3));


    }
}
