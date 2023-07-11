package ss09_tdd.exercise;

public class FizzBuzzTranslate {
    public static String fizzBuzz(int number) {
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);
        String result = "";
        if (divisibleBy3) {
            result += "Fizz";
        } else if (divisibleBy5) {
            if (divisibleBy3) {
                result += "FizzBuzz";
            } else {
                result += "Buzz";
            }
        }
        return result;
    }
}
