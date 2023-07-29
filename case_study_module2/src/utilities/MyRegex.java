package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    /**/
    public static final String NAME = "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$";
    public static final String PERSONAL_ID = "^[0-9]{9,12}$";
    public static final String PHONE_NUMBER = "^0[0-9]{9}$";
    public static final String GENDER = "^male$|^female$|^else$";
    public static final String EMAIL = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6})*$";
    public static final String EMPLOY_LEVEL = "^intermediate$|^degree$|^college$|^graduate$";
    public static final String EMPLOY_ID = "^NV-[0-9]{4}$";
    public static final String CUSTOMER_ID = "^KH-[0-9]{4}$";
    public static final String CUSTOMER_TYPE = "^diamond$|^platinum$|^gold$|^silver$|^member&";
    public static final String ADDRESS = "^.$"; //nang cap phuong thuc kiem tra dia chi
    /**/
    private static Pattern pattern;
    private Matcher matcher;
    public boolean myRegex(String input, String REGEX_STRING) {
        pattern = Pattern.compile(REGEX_STRING);
        matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
