package ss19_regex.practice.practice_1;

public class Test {
    private static EmailExample emailExample =new EmailExample();
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        for (String email : validEmail) {
            boolean flag = emailExample.validate(email);
            System.out.println("Email: " + email + " is valid? " + flag);
        }
        for (String email : invalidEmail) {
            boolean flag = emailExample.validate(email);
            System.out.println("Email: " + email + " is valid? " + flag);
        }
    }
}
