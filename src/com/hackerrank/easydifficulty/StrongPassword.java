package com.hackerrank.easydifficulty;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MIN_LENGTH = 6;

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = SCANNER.nextLine();

        System.out.println(minimumNumber(n, s));
    }

    static int minimumNumber(int n, String password) {
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%^&*()+-]");

        Matcher hasLowerCase = lowerCase.matcher(password);
        Matcher hasUpperCase = upperCase.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);

        int count = 0;

        if (!hasDigit.find()) {
            count++;
        }

        if (!hasLowerCase.find()) {
            count++;
        }

        if (!hasUpperCase.find()) {
            count++;
        }

        if (!hasSpecial.find()) {
            count++;
        }

        if ((password.length() + count) < 6) {
            count += (MIN_LENGTH - password.length() - count);
        }

        return count;
    }
}