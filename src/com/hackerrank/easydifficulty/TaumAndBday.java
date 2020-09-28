package com.hackerrank.easydifficulty;

import java.io.*;

public class TaumAndBday {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            long b = Integer.parseInt(firstMultipleInput[0]);
            long w = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            long bc = Integer.parseInt(secondMultipleInput[0]);
            long wc = Integer.parseInt(secondMultipleInput[1]);
            long z = Integer.parseInt(secondMultipleInput[2]);

            long result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        if ((bc + z) < wc) {
            wc = bc + z;
        }

        if ((wc + z) < bc) {
            bc = wc + z;
        }

        return (b * bc) + (w * wc);
    }
}