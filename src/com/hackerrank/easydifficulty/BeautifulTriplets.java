package com.hackerrank.easydifficulty;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(beautifulTriplets(d, arr));
    }

    static int beautifulTriplets(int d, int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        int count = 0;

        for (Integer i : list) {
            if (list.contains(i + d) && list.contains(i + (2 * d))) {
                count++;
            }
        }
        return count;
    }
}
