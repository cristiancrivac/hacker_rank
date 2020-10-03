package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        long n = scanner.nextLong();

        System.out.println(repeatedString(s, n));
    }

    static long repeatedString(String s, long n) {
        long res = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        res = count * (n / (s.length()));
        count = 0;

        for (int i = 0; i < (n % (s.length())); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        res += count;

        return res;
    }
}