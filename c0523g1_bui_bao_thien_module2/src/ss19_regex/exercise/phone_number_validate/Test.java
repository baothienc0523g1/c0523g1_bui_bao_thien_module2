package ss19_regex.exercise.phone_number_validate;

public class Test {
    public static PhoneNumberValidate check = new PhoneNumberValidate();

    public static void main(String[] args) {
        String[] valid = new String[]{"(84)-(0978489648)", "(46)-(0548489648)"};
//        String[] valid = new String[]{"84-0978489648", "(46)(0548489648)"};
        String[] inValid = new String[]{"(a8)-(0978489648)", "(86)-(asd9989648)", "(84)-(9978489648)"};

        for (String string : valid) {
            System.out.println("Phone number " + string + " is valid? " + check.numberValidate(string));
        }
        System.out.println("------");
        for (String string : inValid) {
            System.out.println("Phone number " + string + " is valid? " + check.numberValidate(string));
        }
    }
}
