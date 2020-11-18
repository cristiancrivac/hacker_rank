package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(pageCount(n, p));
    }

    static int pageCount(int n, int p) {
        if (p == 1 || p == n || ((p + 1) == n) && (n % 2 == 1)) {
            return 0;
        }

        if (n % 2 == 1) {
            n = n - 1;
        }

        if ((n - p) < Math.abs(1 - p)) {
            return (n - p + 1) / 2;
        } else if ((n - p) > Math.abs(1 - p)) {
            return p / 2;
        } else {
            return 1;
        }
    }
}