package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();

        System.out.println(appendAndDelete(s, t, k));
    }

    static String appendAndDelete(String s, String t, int k) {
        int commonStringChars = 0;
        int smallestString;
        int x, y;
        char c1, c2;

        smallestString = Math.min(s.length(), t.length());

        for (int i = 0; i < smallestString; i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);

            if (c1 == c2) {
                commonStringChars++;
            } else {
                break;
            }
        }

        x = s.length() - commonStringChars;
        y = t.length() - commonStringChars;

        if ((x == 0) && (y % 2 == 1) && (k % 2 == 0)) {
            return "No";
        }

        if ((x + y) <= k) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
