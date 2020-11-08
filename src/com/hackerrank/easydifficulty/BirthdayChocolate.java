package com.hackerrank.easydifficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        int d = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(birthday(list, d, m));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            if (sum == d) {
                count++;
            }

            sum = 0;
        }

        return count;
    }
}
