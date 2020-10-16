package com.hackerrank.easydifficulty;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(superReducedString(s));
    }

    static String superReducedString(String s) {
        List<Character> chars = s.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        int i = 1;

        while (i < chars.size()) {
            if (chars.get(i).equals(chars.get(i - 1))) {
                chars.remove(i);
                chars.remove(i - 1);
                i = 1;
            } else {
                i++;
            }
        }

        if (chars.size() == 0) {
            return "Empty String";
        } else {
            return chars.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining());
        }
    }
}

