package com.hackerrank.mediumdifficulty;

import java.util.Arrays;
import java.util.Scanner;

public class LarrysArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String[] res = new String[t];

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            res[i] = larrysArray(arr);
        }

        for (String re : res) {
            System.out.println(re);
        }
    }

    static String larrysArray(int[] a) {
        if (Arrays.stream(a).sum() != ((a.length * (a.length + 1))) / 2) {
            return "NO";
        }

        

        return "YES";
    }
}
