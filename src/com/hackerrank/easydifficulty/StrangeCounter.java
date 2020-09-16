package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class StrangeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long t = scanner.nextLong();

        System.out.println(strangeCounter(t));
    }

    static long strangeCounter(long t) {
        long cycle = (long) Math.floor(Math.log(((t + 2) / 3)) / Math.log(2));
        long t0 = 1;

        if (cycle != 0) {
            t0 = (long) (Math.pow(2, cycle) * 3 - 2);
        }

        return 2 * t0 - t + 2;
    }
}