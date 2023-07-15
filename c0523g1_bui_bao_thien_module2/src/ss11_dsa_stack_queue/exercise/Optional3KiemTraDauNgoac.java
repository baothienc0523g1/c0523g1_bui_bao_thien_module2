package ss11_dsa_stack_queue.exercise;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.sql.Array;
import java.util.*;

public class Optional3KiemTraDauNgoac {
    /*Luồng thực thi:
     * Nếu mỗi ký tự là dấu mở ngoặc thì cho vào stack
     *Sau đó bắt đầu xét
     *
     * từng phần từ đóng ngoặc và bStack.pop
     * có khớp hay không, nếu không khớp thì false
     * nếu khớp thì tiếp tục pop,
     * cuối cùng return bStack.isEmpty */
    public static boolean syntaxCheck(String string) {
        String result = "";
        Stack<Character> bStack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {
            char temp = string.charAt(i);
            if (temp == '{' || temp == '(' || temp == '[') {
                bStack.push(temp);
            }
        }
        for (int j = 0; j < string.length(); j++) {
            char temp2 = string.charAt(j);
            if (bStack.isEmpty())
                return false;
            else if (temp2 == '}' && bStack.pop() != '{')
                return false;
            else if (temp2 == ')' && bStack.pop() != '(')
                return false;
            else if (temp2 == ']' && bStack.pop() != '[')
                return false;
        }

        return bStack.isEmpty();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your biểu thức vào here");
        String string = input.nextLine();
        System.out.println(syntaxCheck(string));

    }
}
