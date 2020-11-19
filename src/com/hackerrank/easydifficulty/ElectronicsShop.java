package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for (int i = 0; i < n; i++) {
            keyboards[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            drives[i] = scanner.nextInt();
        }

        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (keyboard + drive < b) {
                    max = Math.max(max, keyboard + drive);
                }
            }
        }

        if (max == 0) {
            return -1;
        } else {
            return max;
        }
    }
}
