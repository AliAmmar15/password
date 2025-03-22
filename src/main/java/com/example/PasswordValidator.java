package com.example;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 16) {
            return false; 
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        String specialChars = "~!@#$%^&*()-=+_";

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.contains(String.valueOf(c))) hasSpecial = true;
        }

        int categoryCount = (hasLower ? 1 : 0) + (hasUpper ? 1 : 0) + 
                            (hasDigit ? 1 : 0) + (hasSpecial ? 1 : 0);

        return categoryCount >= 3; 
    }
}
