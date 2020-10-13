package com.hackerrank.easydifficulty;

import java.util.*;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] res = cutTheSticks(arr);

        for (int elem : res) {
            System.out.println(elem);
        }
    }

    static int[] cutTheSticks(int[] arr) {
        List<Integer> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for (int elem : arr) {
            list.add(elem);
        }

        while (list.size() > 0) {
            int min = Collections.min(list);

            for (int i = 0; i < list.size(); i++) {
                int current = list.get(i);

                if (current - min <= 0) {
                    list.remove(i);
                    count++;
                    i--;
                }

                if (current - min > 0) {
                    count++;
                    list.set(i, current - min);
                }
            }

            res.add(count);
            count = 0;
        }

        int[] array = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            array[i] = res.get(i);
        }

        return array;
    }
}