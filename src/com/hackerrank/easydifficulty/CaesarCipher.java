package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(caesarCipher(s, k));
    }

    static String caesarCipher(String s, int k) {
        StringBuilder encrypted = new StringBuilder();
        int decAscii;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                decAscii = (s.charAt(i) + k - 'A') % 26 + 'A';
            } else if (Character.isLowerCase(s.charAt(i))) {
                decAscii = (s.charAt(i) + k - 'a') % 26 + 'a';
            } else {
                decAscii = s.charAt(i);
            }

            encrypted.append((char) decAscii);
        }

        return encrypted.toString();
    }
}
