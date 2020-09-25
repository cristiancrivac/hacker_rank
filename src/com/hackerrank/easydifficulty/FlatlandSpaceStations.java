package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextInt();
        }

        System.out.println(flatlandSpaceStations(n, c));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int k : c) {
                minDistance = Math.min(minDistance, Math.abs(k - i));
            }

            maxDistance = Math.max(maxDistance, minDistance);
            minDistance = Integer.MAX_VALUE;
        }

        return maxDistance;
    }
}
