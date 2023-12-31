package ss09_tdd.practice.absolute_number_calculator;

import org.junit.Test;
import ss09_tdd.practice.AbsoluteNumberCalculator;

import static org.junit.jupiter.api.Assertions.*;
public class AbsoluteNumberCalculatorTest {
    @Test
    public void testFindAbsolute() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFindAbsolute1() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    public void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}