package com.hackerrank.easydifficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int b = scanner.nextInt();

        bonAppetit(list, k, b);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;

        for (Integer integer : bill) {
            sum += integer;
        }

        if ((sum - bill.get(k)) / 2 == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (sum - bill.get(k)) / 2);
        }
    }
}
