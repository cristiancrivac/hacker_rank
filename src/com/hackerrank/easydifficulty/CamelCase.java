package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(camelcase(s));
    }

    static int camelcase(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}