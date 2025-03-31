package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isLengthValid() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.isLengthValid("12345678"));
        assertFalse(passwordValidator.isLengthValid("123"));
    }

    @Test
    void checkNumber() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.hasDigit("Pass1"));
        assertTrue(passwordValidator.hasDigit("Pass"));
    }

    @Test
    void hasUpperLower() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.checkUpperLower("PPPPPaaaaa"));
    }

    @Test
    void usedPassword() {

        String passwords[] = {"Password", "Password1"};
        PasswordValidator passwordValidator = new PasswordValidator();

        String isUsed = "Password";
        String isNotUsed = "NewPassword";
        assertTrue(passwordValidator.usedPassword(isUsed, passwords));
        assertFalse(passwordValidator.usedPassword(isNotUsed, passwords));
    }
}