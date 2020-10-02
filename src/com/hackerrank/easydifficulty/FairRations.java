package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class FairRations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] b = new int[n];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            sum += b[i];
        }

        if (sum % 2 == 1) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                if (b[i] % 2 != 0) {
                    b[i + 1] = b[i + 1] + 1;
                    count += 2;
                }
            }

            System.out.println(count);
        }
    }
}
