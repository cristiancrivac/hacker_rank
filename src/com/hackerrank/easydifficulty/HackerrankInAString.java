package com.hackerrank.easydifficulty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HackerrankInAString {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        scanner.close();
    }

    static String hackerrankInString(String s) {
        String str = "hackerrank";
        int index = 0;

        if (s.length() < str.length()) {
            return "NO";
        }

        for (int i = 0; i < s.length(); i++) {
            if (index < s.length() && s.charAt(i) == str.charAt(index)) {
                index++;
            }

            if (index == str.length()) {
                return "YES";
            }
        }

        return "NO";
    }
}