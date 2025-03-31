package org.example;

public class PasswordValidator {

    public boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    public boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit((i))) {
                return true;
            }

        }
        return false;
    }

    public boolean checkUpperLower(String password) {
        boolean lower = false;
        boolean upper = false;

        for (int i = 0; i < password.length(); i++) {
            char pass = password.charAt(i);

            if (Character.isLowerCase(pass)) {
                lower = true;
            }
            if (Character.isUpperCase(pass)) {
                upper = true;
            }

            if (lower && upper) {
                return true;
            }

        }
        return false;
    }

    public boolean usedPassword(String newPassword, String[] passwords) {
        for (String p : passwords) {
            if (newPassword.equals(p)) {
                return true;
            }
        }
        return false;
    }
}