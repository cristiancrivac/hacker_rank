package com.hackerrank.easydifficulty;

import java.util.*;

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(equalizeArray(arr));
    }

    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxOccurrence = 0;

        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else {
                map.put(i, map.get(i) + 1);
                if (maxOccurrence < map.get(i)) {
                    maxOccurrence = map.get(i);
                }
            }
        }

        return arr.length - maxOccurrence;
    }
}
