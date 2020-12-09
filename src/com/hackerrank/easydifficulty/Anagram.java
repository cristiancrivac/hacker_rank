package com.hackerrank.easydifficulty;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[q];

        for (int i = 0; i < q; i++) {
            arr[i] = scanner.nextLine();
        }

        for (String s : arr) {
            System.out.println(anagram(s));
        }
    }

    static int anagram(String s) {
        if (s.length() % 2 == 1) {
            return -1;
        }

        String s1 = s.substring(0, (s.length() / 2));
        String s2 = s.substring(s.length() / 2);

        List<Character> listS2 = s2.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList());

        for (int i = 0; i < s1.length(); i++) {
            Character elem = s1.charAt(i);
            listS2.remove(elem);
        }

        return listS2.size();
    }
}