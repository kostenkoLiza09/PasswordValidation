package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isLengthValid() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.isLengthValid("12345678"));
        assertFalse(passwordValidator.isLengthValid("12"));
        assertFalse(passwordValidator.isLengthValid("1234567890123444455111111111"));
    }

    @Test
    void checkNumber() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.hasDigit("Pass1"));
        assertFalse(passwordValidator.hasDigit("Pass"));
    }

    @Test
    void hasUpperLower() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.checkUpperLower("PPPPPaaaaa"));
        assertTrue(passwordValidator.checkUpperLower("aA"));
        assertFalse(passwordValidator.checkUpperLower("12345"));
        assertFalse(passwordValidator.checkUpperLower("PPPPP"));
    }

    @Test
    void usedPassword() {

        String passwords[] = {"Password", "Password1"};
        PasswordValidator passwordValidator = new PasswordValidator();

        String isUsed = "Password";
        String weakPassword = "Password1";
        String strongPassword = "NewPassword1!";

        assertTrue(passwordValidator.usedPassword(isUsed, passwords));
        assertTrue(passwordValidator.usedPassword(weakPassword, passwords));
        assertFalse(passwordValidator.usedPassword(strongPassword, passwords));
    }
}