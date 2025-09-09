
interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        if (password == null || password.length() < 8)
            return false;

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUpper = true;
            else if (Character.isLowerCase(ch))
                hasLower = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else
                hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class PasswordStrength {
    public static void main(String[] args) {
        String[] testPasswords = {
                "Pass123!",
                "weakpass",
                "PASSWORD1",
                "Passw0rd",
                "Good#123"
        };

        for (String pwd : testPasswords) {
            System.out.println(pwd + " -> " +
                    (SecurityUtils.isStrongPassword(pwd) ? "Strong" : "Weak"));
        }
    }
}
