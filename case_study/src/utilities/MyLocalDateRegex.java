package utilities;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyLocalDateRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String LOCAL_DATE_REGEX = "^\\d{4}\\-\\d{2}\\-\\d{2}$";
    public boolean myDateRegex(LocalDate input) {
        String day = input.toString();
        pattern = Pattern.compile(LOCAL_DATE_REGEX);
        matcher = pattern.matcher(day);
        return matcher.matches();
    }
}
