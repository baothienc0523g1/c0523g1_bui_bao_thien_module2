package ss19_regex.practice.practice_2;

public class Test extends AccountSyntax {
    private static AccountSyntax account = new AccountSyntax();

    public static void main(String[] args) {
        String[] validAccount = new String[]{"1234abc", "fvbnm", "___222", "oqiwe"};
        String[] invalidAccount = new String[]{"1234", ".!@#$", "-", "PJJPpoo"};

        for (String string : validAccount) {
            System.out.println("String: " + string + " is valid? " + account.accountSyntax(string));
        }
        for (String string : invalidAccount) {
            System.out.println("String: " + string + " is valid? " + account.accountSyntax(string));
        }
    }
}
