package com.hackerrank.mediumdifficulty;

import java.util.*;

public class EmaSupercomputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.nextLine();

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();

            for (int j = 0; j < m; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        System.out.println(twoPluses(grid));
    }

    static int twoPluses(char[][] grid) {
        List<String> list = new ArrayList<>();
        List<Integer> product = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int min;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'G') {
                    min = Math.min(Math.min(i, j), Math.min((grid.length - i - 1), (grid[0].length - j - 1)));

                    s.append(i).append(j);

                    for (int k = 1; k <= min; k++) {
                        if (grid[i - k][j] == 'G' && grid[i + k][j] == 'G' && grid[i][j - k] == 'G' && grid[i][j + k] == 'G') {
                            s.append(" ").append(i - k).append(j);
                            s.append(" ").append(i + k).append(j);
                            s.append(" ").append(i).append(j - k);
                            s.append(" ").append(i).append(j + k);
                            list.add(s.toString());
                        } else {
                            break;
                        }
                    }

                    list.add(s.toString());
                    s.setLength(0);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String s1 = list.get(i);
                String s2 = list.get(j);
                boolean diff = true;

                for (String s3 : s2.split(" ")) {
                    if (s1.contains(s3)) {
                        diff = false;
                        break;
                    }
                }

                if (diff) {
                    product.add(s1.split(" ").length * s2.split(" ").length);
                }
            }
        }

        Collections.sort(product);

        return product.get(product.size() - 1);
    }
}
