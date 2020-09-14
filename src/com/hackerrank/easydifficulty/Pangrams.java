package com.hackerrank.easydifficulty;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(pangrams(s));
    }

    static String pangrams(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String uniqueLetters = Arrays.stream(s.toLowerCase().replaceAll("\\s", "").split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());

        if (alphabet.equals(uniqueLetters)) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }
}