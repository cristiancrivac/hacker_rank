package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(howManyGames(p, d, m, s));
    }

    static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int totalPrice = p;
        int currentPrice = p;

        while (totalPrice <= s) {
            currentPrice = currentPrice - d;

            if (currentPrice < m) {
                currentPrice = m;
            }

            totalPrice += currentPrice;
            count++;
        }

        return count;
    }
}