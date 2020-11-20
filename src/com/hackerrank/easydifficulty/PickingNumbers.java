package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[100];

        for (int i = 0; i < n; i++) {
            a[scanner.nextInt()]++;
        }

        System.out.println(pickingNumbers(a));
    }

    public static int pickingNumbers(int[] a) {
        int max = 0;

        for (int i = 0; i < a.length - 1; i++) {
            max = Math.max(max, a[i] + a[i + 1]);
        }

        return max;
    }
}
