import java.util.Stack;

public class KiemTraDauNgoacBangStack {
    public static void main(String[] args) {
        String testCase1 = "[(()]";
        String testCase2 = "[()]";
        String testCase3 = "(){}[]";
        String testCase4 = "))((";
        System.out.println(isValid(testCase1));
        System.out.println(isValid(testCase2));
        System.out.println(isValid(testCase3));
        System.out.println(isValid(testCase4));
    }
// :))
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
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
            }
        }
        return stack.isEmpty();
    }
}
