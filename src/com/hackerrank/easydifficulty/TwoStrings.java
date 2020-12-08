package com.hackerrank.easydifficulty;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            result[i] = twoStrings(s1, s2);
        }

        for (String s : result) {
            System.out.println(s);
        }
    }

    static String twoStrings(String s1, String s2) {
        Set<Character> chars = s1.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toSet());

        for (Character character : chars) {
            if (s2.contains(String.valueOf(character))) {
                return "YES";
            }
        }

        return "NO";
    }
}