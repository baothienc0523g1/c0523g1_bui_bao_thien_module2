package ss09_tdd.exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    public void testNextDay() {
        int day = 19;
        int month = 11;
        int year = 2022;
        int expectedDay = 20;
        int result = NextDayCalculator.nextDayCalculatorTest(day,month,year);
        assertEquals(expectedDay, result);
    } @Test
    public void testNextDay1() {
        int day = 32;
        int month = 11;
        int year = 2022;
        int expectedDay = 1;
        int result = NextDayCalculator.nextDayCalculatorTest(day,month,year);
        assertEquals(expectedDay, result);
    }
    @Test
    public void testNextDay2() {
        int day = 30;
        int month = 2;
        int year = 2021;
        int expectedDay = -1;
        int result = NextDayCalculator.nextDayCalculatorTest(day,month,year);
        assertEquals(expectedDay, result);
    }
}