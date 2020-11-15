package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int elem : arr) {
            System.out.println(utopianTree(elem));
        }
    }

    static int utopianTree(int n) {
        int treeSize = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                treeSize++;
            } else {
                treeSize *= 2;
            }
        }

        return treeSize;
    }
}