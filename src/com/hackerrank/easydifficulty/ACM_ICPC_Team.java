package com.hackerrank.easydifficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACM_ICPC_Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        int[] res = acmTeam(arr);

        for (int elem : res) {
            System.out.println(elem);
        }
    }

    static int[] acmTeam(String[] topic) {
        List<Integer> countArr = new ArrayList<>();
        int count = 0;
        int max = 0;

        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                for (int k = 0; k < topic[0].length(); k++) {
                    if ((topic[i] != null && topic[j] != null) && (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1')) {
                        count++;
                    }
                }
                countArr.add(count);
                count = 0;
            }
        }

        max = countArr.stream().max(Integer::compare).get();

        for (int i : countArr) {
            if (i == max) {
                count++;
            }
        }

        return new int[] {max, count};
    }
}
