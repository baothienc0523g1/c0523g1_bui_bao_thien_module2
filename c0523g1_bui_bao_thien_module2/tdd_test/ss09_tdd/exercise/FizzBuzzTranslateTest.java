package ss09_tdd.exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {
    @Test
    public static void fizzBuzzTest(){
        int number = 15;
        String expectResult = "FizzBuzz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expectResult, result);
    }
    @Test
    public static void fizzBuzzTest1(){
        int number = 9;
        String expectResult = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expectResult, result);
    }
    @Test
    public static void fizzBuzzTest2(){
        int number = 20;
        String expectResult = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expectResult, result);
    }
    @Test
    public static void fizzBuzzTest3(){
        int number = 30;
        String expectResult = "FizzBuzz";
        String result = FizzBuzzTranslate.fizzBuzz(number);
        assertEquals(expectResult, result);
        
    }
}