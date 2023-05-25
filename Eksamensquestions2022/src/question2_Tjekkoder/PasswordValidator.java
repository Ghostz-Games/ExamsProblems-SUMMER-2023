package question2_Tjekkoder;

public class PasswordValidator {

    private int minLength;
    private int maxLength;
    private boolean numbersRequired;
    private boolean uppercaseRequired;

    public PasswordValidator(int minLength, int maxLength, boolean numbersRequired, boolean uppercaseRequired) {

        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
        this.uppercaseRequired = uppercaseRequired;

    }

    public boolean isValid(String password) {
        boolean containsNumber = false;
        boolean containsUppercase = false;
        if ((password.length() >= minLength) && (password.length() <= maxLength)) {
            if (uppercaseRequired) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        containsUppercase = true;
                    }
                }
            }
            if (numbersRequired) {
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isDigit(password.charAt(i))) {
                        containsNumber = true;
                    }
                }
            }

            return numbersRequired == containsNumber && uppercaseRequired == containsUppercase;
        }
        return false;
    }
}


