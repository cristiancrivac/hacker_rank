package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(marsExploration(s));
    }

    static int marsExploration(String s) {
        char[] sos = {'S', 'O', 'S'};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos[(i + 3) % 3]) {
                count++;
            }
        }

        return count;
    }
}