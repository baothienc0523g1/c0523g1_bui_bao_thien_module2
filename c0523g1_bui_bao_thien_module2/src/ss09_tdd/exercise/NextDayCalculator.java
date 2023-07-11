package ss09_tdd.exercise;

public class NextDayCalculator {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        if (divisibleBy4) {
            if (divisibleBy100) {
                if (divisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static boolean checkInputData(int day, int month) {
        boolean inputData = false;
        if (day <= 0 || day >= 32 && month <= 0 || month >= 13) {
            return inputData = false;
        } else {
            return inputData = true;
        }
    }

    public static int nextDayCalculatorTest(int day, int month, int year) {
        int nextDay = 1;
        if (checkInputData(day, month)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day <= 30) {
                        return nextDay += day;
                    } else
                        return nextDay;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 29) {
                        return nextDay += day;

                    } else
                        return nextDay;
                case 2:
                    if (isLeapYear(year)) {
                        if (day <= 28) {
                            return nextDay += day;
                        } else if (day >= 30)
                            return -1;
                        else
                            return nextDay;
                    } else {
                        if (day <= 27) {
                            return nextDay += day;
                        } else if (day >= 29)
                            return -1;
                        else
                            return nextDay;
                    }
            }
        }
        return nextDay;
    }
}
