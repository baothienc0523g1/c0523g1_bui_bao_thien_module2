import java.util.LinkedList;

public class TimChuoiLienTucDaiNhat {
    public static int lengthOfLongestSubstring(String s) {

        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> lastList = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) > list.getLast()) {
                    list.add(s.charAt(j));
                } else {
                    break;
                }
            }
            if (list.size() > lastList.size()) {
                lastList.clear();
                lastList.addAll(list);
            }
            list.clear();
        }


        return lastList.size();
    }

    public static void main(String[] args) {
        String a = "bbbbb";
        System.out.println(lengthOfLongestSubstring(a));;
    }
}
