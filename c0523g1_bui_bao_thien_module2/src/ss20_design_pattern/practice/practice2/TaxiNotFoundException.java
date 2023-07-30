package ss20_design_pattern.practice.practice2;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
