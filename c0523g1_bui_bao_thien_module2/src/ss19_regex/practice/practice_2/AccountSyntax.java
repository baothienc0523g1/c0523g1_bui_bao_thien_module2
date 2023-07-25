package ss19_regex.practice.practice_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountSyntax {
    private static Pattern pattern;
    private Matcher matcher;
    private final static String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountSyntax() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean accountSyntax(String input) {
        matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
