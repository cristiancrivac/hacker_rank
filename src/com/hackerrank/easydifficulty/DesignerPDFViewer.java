package com.hackerrank.easydifficulty;

import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String word = scanner.nextLine();

        System.out.println(designerPdfViewer(arr, word));
    }

    static int designerPdfViewer(int[] h, String word) {
        int charIndexInArray = 0;
        int max = 0;

        for (int i = 0; i < word.length(); i++) {
            charIndexInArray = word.charAt(i) - 97;
            max = Math.max(max, h[charIndexInArray]);
        }

        return max * word.length();
    }
}