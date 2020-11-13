package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] res = new int[t];

        for (int i = 0; i < t; i++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);
            int m = Integer.parseInt(nms[1]);
            int s = Integer.parseInt(nms[2]);

            res[i] = saveThePrisoner(n, m, s);
        }

        for (int i : res) {
            System.out.println(i);
        }
    }

    static int saveThePrisoner(int n, int m, int s) {
        if ((m % n) == 0) {
            return n;
        } else {
            return (m % n) + (s - 1);
        }
    }
}