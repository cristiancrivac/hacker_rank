package com.hackerrank.easydifficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arr = new String[q];

        for (int i = 0; i < q; i++) {
            arr[i] = scanner.nextLine();
        }

        for (String s : arr) {
            System.out.println(funnyString(s));
        }
    }

    static String funnyString(String s) {
        List<Integer> absoluteDifference = new ArrayList<>();
        int difference = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
            absoluteDifference.add(difference);
        }

        for (int i = 0; i < absoluteDifference.size(); i++) {
            if (!absoluteDifference.get(i).equals(absoluteDifference.get(absoluteDifference.size() - i - 1))) {
                return "Not Funny";
            }
        }

        return "Funny";
    }
}
