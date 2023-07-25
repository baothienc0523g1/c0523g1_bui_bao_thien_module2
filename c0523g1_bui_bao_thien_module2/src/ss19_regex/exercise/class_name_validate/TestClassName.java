package ss19_regex.exercise.class_name_validate;

import ss19_regex.exercise.class_name_validate.ClassNameValidate;

public class TestClassName {
    private static ClassNameValidate validate = new ClassNameValidate();

    public static void main(String[] args) {
        String[] valid = new String[]{"C0223G", "A0323K"};
        String[] inValid = new String[]{"M0318G", "P0323A"};

        for (String string : valid) {
            System.out.println("Class with name " + string + " is valid? " + validate.classNameValidate(string));
        }
        System.out.println("-----");
        for (String string : inValid) {
            System.out.println("Class with name " + string + " is valid? " + validate.classNameValidate(string));
        }
    }
}
