package z_test_case;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> ch = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > ch.getLast()) {
                    ch.add(s.charAt(j));
                }
            }
            if (ch.size() > max.size()) {
                max.clear();
                max.addAll(ch);
                ch.clear();
            }
        }
        return max.size();
    }
}
