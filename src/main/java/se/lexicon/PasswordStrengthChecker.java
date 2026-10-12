package se.lexicon;

public class PasswordStrengthChecker {
    void main() {
        String password = IO.readln("Enter password: ");
        int rulesNumber = 0;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        if (password.length() >= 8) {
            rulesNumber++;

        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                hasUppercase = true;
            }
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        if (hasUppercase) {
            rulesNumber++;
        }
        if (hasDigit) {
            rulesNumber++;
        }

        IO.println("Rules met: " +rulesNumber +"/" +"3");
        if (rulesNumber == 3) {
            IO.println("Rating: Strong");
        } else if (rulesNumber == 2) {
            IO.println("Rating: Medium");
        } else {
            IO.println("Rating: Weak");
        }
    }
}
