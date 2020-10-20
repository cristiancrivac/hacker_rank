package com.hackerrank.easydifficulty;

import java.io.*;
import java.util.Scanner;

public class CavityMap {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        char[][] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                bufferedWriter.write(result[i][j]);
            }

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }

    static char[][] cavityMap(String[] grid) {
        char[][] array2d = new char[grid.length][grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                array2d[i][j] = grid[i].charAt(j);
            }
        }

        for (int i = 1; i < array2d.length - 1; i++) {
            for (int j = 1; j < array2d.length - 1; j++) {
                if ((array2d[i][j] > array2d[i - 1][j]) && (array2d[i][j] > array2d[i][j + 1]) && (array2d[i][j] > array2d[i + 1][j]) && (array2d[i][j] > array2d[i][j - 1])) {
                    array2d[i][j] = 'X';
                }
            }
        }

        return array2d;
    }
}