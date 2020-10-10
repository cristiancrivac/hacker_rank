package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class LisaWorkbook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(workbook(n, k, arr));
    }

    static int workbook(int n, int k, int[] arr) {
        int count = 0;
        int page = 1;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (j % k == 0) {
                    flag = true;
                }

                if (page == j) {
                    count++;
                }

                if (flag && j != arr[i]) {
                    page++;
                }

                flag = false;
            }

            page++;
        }

        return count;
    }
}
