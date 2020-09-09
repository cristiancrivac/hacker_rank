package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        String[] arr = new String[q];

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) {
            arr[i] = scanner.nextLine();
        }

        for (String s : arr) {
            System.out.println(alternatingCharacters(s));
        }
    }

    static int alternatingCharacters(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
        }

        return count;
    }
}