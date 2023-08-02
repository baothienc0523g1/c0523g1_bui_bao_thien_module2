package z_bai_tap_lam_them;

public class Bai4 {
    /* chua hoan thanh */
    public static String transform(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += " " + Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "HelloCodeGymAbc";
        System.out.println(transform(s));
        //hello code gym abc
    }
}
