package com.hackerrank.mediumdifficulty;

import java.util.Scanner;

public class TheTimeInWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(timeInWords(h, m));
    }

    static String timeInWords(int h, int m) {

        String[] numbersInWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
                "twenty six", "twenty seven", "twenty eight", "twenty nine"};

        if (m == 0) {
            return numbersInWords[h] + " o' clock";
        } else if (m == 1) {
            return "one minute past " + numbersInWords[h];
        } else if (m == 30) {
            return "half past " + numbersInWords[h];
        } else if (m == 15) {
            return "quarter past " + numbersInWords[h];
        } else if (m == 45) {
            return "quarter to " + numbersInWords[h + 1];
        } else if (m < 30) {
            return numbersInWords[m] + " minutes past " + numbersInWords[h];
        } else if (m < 59) {
            return numbersInWords[60 - m] + " minutes to " + numbersInWords[h + 1];
        } else if (m == 59) {
            return numbersInWords[60 - m] + " minute to " + numbersInWords[h + 1];
        } else {
            return "error";
        }
    }
}
