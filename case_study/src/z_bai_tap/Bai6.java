package z_bai_tap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bai6 {

    public static ArrayList<Character> findChar(String str) {
        ArrayList<Character> list = new ArrayList<>();
        int value = 1;
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (characterIntegerMap.containsKey(str.charAt(i))) {
                characterIntegerMap.put(str.charAt(i), (characterIntegerMap.get(str.charAt(i)) + 1));
            } else {
                characterIntegerMap.put(str.charAt(i), value);
            }
        }

        for (Character character : characterIntegerMap.keySet()) {
            if (characterIntegerMap.get(character) >= 2) {
                list.add(character);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String s = "abcbdcef";
        String s2 = "abdcef";

        System.out.println(findChar(s));
        System.out.println(findChar(s2));
    }
}
