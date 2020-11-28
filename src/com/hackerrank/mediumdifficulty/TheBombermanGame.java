package com.hackerrank.mediumdifficulty;

import java.util.Scanner;

public class TheBombermanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        char[][] grid = new char[r][c];
        char[][] res;

        for (int i = 0; i < r; i++) {
            String data = scanner.next();

            for (int j = 0; j < c; j++) {
                grid[i][j] = data.charAt(j);
            }
        }

        res = bomberMan(n, grid);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (((n + 3) % 3) != 0) {
                    System.out.print(res[i][j]);
                } else {
                    System.out.print((char) (res[i][j] - 15));
                }
            }
            System.out.println();
        }
    }

    static char[][] bomberMan(int n, char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int cycle = (n + 3) % 3;

        if (cycle == 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (grid[i][j] == 'O') {
                        grid[i][j] = '=';

                        if (((i - 1) >= 0) && grid[i - 1][j] != 'O') {
                            grid[i - 1][j] = '=';
                        }

                        if (((i + 1) < rows) && grid[i + 1][j] != 'O') {
                            grid[i + 1][j] = '=';
                        }

                        if (((j - 1) >= 0) && grid[i][j - 1] != 'O') {
                            grid[i][j - 1] = '=';
                        }

                        if (((j + 1) < columns) && grid[i][j + 1] != 'O') {
                            grid[i][j + 1] = '=';
                        }
                    }

                    if (grid[i][j] == '.') {
                        grid[i][j] = '^';
                    }
                }
            }
        }

        if (cycle == 2) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    grid[i][j] = 'O';
                }
            }
        }

        return grid;
    }
}