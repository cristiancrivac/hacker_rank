package com.hackerrank.mediumdifficulty;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        //the input array will be surrounded by 0, that is why the size is bigger
        int[][] arr = new int[h + 2][w + 2];

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(surfaceArea(arr));
    }

    static int surfaceArea(int[][] A) {
        int h = A.length - 2;
        int w = A[0].length - 2;

        int area = 2 * h * w;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                area += Math.max(0, A[i][j] - A[i - 1][j]);
                area += Math.max(0, A[i][j] - A[i + 1][j]);
                area += Math.max(0, A[i][j] - A[i][j - 1]);
                area += Math.max(0, A[i][j] - A[i][j + 1]);
            }
        }

        return area;
    }
}