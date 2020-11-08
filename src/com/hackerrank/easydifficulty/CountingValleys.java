package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();

        System.out.println(countingValleys(n, s));
    }

    static int countingValleys(int n, String s) {
        int level = 0;
        int count = 0;
        boolean valley = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'U') {
                level++;
            } else if (c == 'D') {
                level--;
            } else {
                return -1;
            }

            if (level < 0) {
                valley = true;
            }

            if (level >= 0 && valley) {
                valley = false;
                count++;
            }
        }

        return count;
    }
}
