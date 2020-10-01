package com.hackerrank.easydifficulty;

import java.util.*;

public class HappyLadybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] res = new String[g];

        for (int i = 0; i < g; i++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String s = scanner.nextLine();

            res[i] = happyLadybugs(s);
        }

        for (String s : res) {
            System.out.println(s);
        }
    }

    static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        boolean inOrder = true;

        for (int i = 1; i < b.length(); i++) {
            if ((b.charAt(i) != b.charAt(i - 1)) && (b.charAt(i) != b.charAt(i + 1))) {
                inOrder = false;
                break;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) + 1);
            } else {
                map.put(b.charAt(i), 1);
            }
        }

        for (Character c : map.keySet()) {
            if (((map.get(c) == 1) && (c != '_'))) {
                return "NO";
            }
        }

        if (map.containsKey('_') || inOrder) {
            return "YES";
        } else {
            return "NO";
        }
    }
}