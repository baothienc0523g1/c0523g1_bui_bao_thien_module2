package utilities;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class LocalDateSyntax {
    public static boolean localDateSyntax(LocalDate input) {
        boolean flag = true;
        Month month = input.getMonth();
        int day = input.getDayOfMonth();
        LocalDate year = LocalDate.ofEpochDay(input.getYear());
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                if (day > 31 || day <= 0) {
                    flag = false;
                    break;
                }
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                if (day > 30 || day <= 0) {
                    flag = false;
                    break;
                }
                break;
            case FEBRUARY:
                if (year.isLeapYear()) {
                    if (day < 1 || day > 29) {
                        flag = false;
                        break;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        flag = false;
                        break;
                    }
                }
                break;
        }
        return flag;
    }

}
