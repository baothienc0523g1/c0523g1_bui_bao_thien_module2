package ss19_regex.exercise.class_name_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String CLASS_NAME_REGEX = "^[C|A|P]+{4}[0-9]+[G|H|I|K]$";
    public ClassNameValidate() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean classNameValidate(String input) {
        matcher = pattern.matcher(input);
        return matcher.matches();
    }


    }

/*Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P

Không chứa các ký tự đặc biệt

Theo sau ký tự bắt đầu là 4 ký tự số

Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K*/