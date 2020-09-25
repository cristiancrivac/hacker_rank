package com.hackerrank.easydifficulty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < t; i++) {
            String[] line = scanner.nextLine().split(" ");

            int n = Integer.parseInt(line[0]);
            int c = Integer.parseInt(line[1]);
            int m = Integer.parseInt(line[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }


    static int chocolateFeast(int n, int c, int m) {
        int count = 0;
        int wrappers = n / c;
        int chocolateBars = n / c;

        while ((wrappers + chocolateBars) >= m) {
            count += chocolateBars;
            chocolateBars = wrappers / m;
            wrappers = chocolateBars + wrappers % m;
        }

        return count + chocolateBars;
    }
}
