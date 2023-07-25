package ss19_regex.exercise.phone_number_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String PHONE_REGEX = "^[(]+{2}[0-9]+[)]+-[(]+0+{9}[0-9]+[)]$";
    public PhoneNumberValidate() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean numberValidate(String phoneNumber) {
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
