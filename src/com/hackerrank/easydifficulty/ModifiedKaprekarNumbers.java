package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long p = scanner.nextLong();
        long q = scanner.nextLong();

        kaprekarNumbers(p, q);
    }

    static void kaprekarNumbers(long p, long q) {
        long square = 0;
        long length = 0;
        int count = 0;
        long firstHalf, secondHalf;

        for (long i = p; i <= q; i++) {
            square = (long) Math.pow(i, 2);
            length = (long) (Math.log10(square) + 1);

            if (length % 2 == 0) {
                firstHalf = (long) (square / Math.pow(10, (length / 2)));
                secondHalf = (long) (square % Math.pow(10, (length / 2)));

                if (firstHalf + secondHalf == i) {
                    System.out.print(i + " ");
                    count++;
                }
            } else {
                firstHalf = (long) (square / Math.pow(10, (length / 2) + 1));
                secondHalf = (long) (square % Math.pow(10, (length / 2) + 1));

                if (firstHalf + secondHalf == i) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("INVALID RANGE");
        }
    }
}
