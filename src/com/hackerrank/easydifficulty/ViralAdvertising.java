package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int res = viralAdvertising(n);

        System.out.println(res);
    }

    static int viralAdvertising(int n) {
        int shared = 5;
        int cumulative = 0;

        for (int i = 1; i <= n; i++) {
            cumulative += shared / 2;
            shared = (shared / 2) * 3;
        }

        return cumulative;
    }
}
