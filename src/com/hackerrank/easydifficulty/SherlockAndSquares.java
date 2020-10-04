package com.hackerrank.easydifficulty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            bufferedWriter.write(String.valueOf(squares(a, b)));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }

    static int squares(int a, int b) {
        int count = 0;

        for (int i = (int) Math.sqrt(a); i <= (int) Math.sqrt(b); i++) {
            if (Math.pow(i, 2) <= b && Math.pow(i, 2) >= a) {
                count++;
            } else if (count != 0) {
                break;
            }
        }

        return count;
    }
}