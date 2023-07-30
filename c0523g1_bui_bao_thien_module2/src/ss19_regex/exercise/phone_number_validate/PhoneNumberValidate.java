package ss19_regex.exercise.phone_number_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String PHONE_REGEX = "\\(\\d{2}\\)\\-\\(\\d{10}\\)";
    public PhoneNumberValidate() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean numberValidate(String phoneNumber) {
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
