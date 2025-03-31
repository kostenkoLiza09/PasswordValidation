package org.example;

import org.apache.commons.lang3.RandomStringUtils;

public class PasswordValidator {

    public boolean isLengthValid(String password) {
        if (password == null) {
            return false;

        }
        int length = password.length();
        return length >= 3 && length <= 20;
    }

    public boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
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
        if (!hasDigit(newPassword)) {
            return true;
        }
        if (!checkUpperLower(newPassword)) {
            return true;
        }

        if (!newPassword.matches(".*[^a-zA-Z0-9].*")) {
            return true;
        }
        return false;
    }

    public void randomPassword (){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
        String pwd = RandomStringUtils.random( 20, characters );
        System.out.println(pwd);
    }
}