package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class Gemstones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println(gemstones(arr));
    }

    static int gemstones(String[] arr) {
        int count = 0;

        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].contains(String.valueOf(c))) {
                    break;
                }

                if (i == (arr.length - 1)) {
                    count++;
                }
            }
        }

        return count;
    }
}
