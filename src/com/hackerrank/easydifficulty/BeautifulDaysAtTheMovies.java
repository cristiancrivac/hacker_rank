package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(beautifulDays(i, j, k));
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int l = i; l <= j; l++) {
            if (Math.abs(l - reverseNumber(l)) % k == 0) {
                count++;
            }
        }

        return count;
    }

    static int reverseNumber(int numberToReverse) {
        int reverse = 0;

        while (numberToReverse != 0) {
            int digit = numberToReverse % 10;
            reverse = reverse * 10 + digit;
            numberToReverse /= 10;
        }

        return reverse;
    }
}
