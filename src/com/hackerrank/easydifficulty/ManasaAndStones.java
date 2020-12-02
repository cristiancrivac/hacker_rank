package com.hackerrank.easydifficulty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class ManasaAndStones {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Integer[] result = stones(n, a, b);

            for (int j = 0; j < result.length; j++) {
                bufferedWriter.write(String.valueOf(result[j]));

                if (j != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }

    static Integer[] stones(int n, int a, int b) {
        TreeSet<Integer> finalStone = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int sol = (i * a) + ((n - 1 - i) * b);
            finalStone.add(sol);
        }

        return finalStone.toArray(new Integer[0]);
    }
}
