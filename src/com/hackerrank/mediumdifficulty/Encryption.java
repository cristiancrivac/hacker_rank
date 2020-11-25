package com.hackerrank.mediumdifficulty;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.length() == 1) {
            System.out.println(s);
            return;
        }

        String[][] y = encryption(s);

        for (int j = 0; j < y[1].length; j++) {
            for (int i = 0; i < y.length; i++) {
                System.out.print(y[i][j]);
            }

            System.out.print(" ");
        }
    }

    static String[][] encryption(String s) {
        String noSpaces = s.replaceAll("\\s", "");
        int rows = (int) Math.sqrt(noSpaces.length());
        int columns = rows + 1;
        int stringIndex = 0;

        if (rows * columns < noSpaces.length()) {
            rows++;
        }

        if (rows * (columns - 1) >= noSpaces.length()) {
            columns--;
        }

        String[][] arr = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (stringIndex >= noSpaces.length()) {
                    arr[i][j] = "";
                } else {
                    arr[i][j] = String.valueOf(noSpaces.charAt(stringIndex));
                    stringIndex++;
                }
            }
        }

        return arr;
    }
}
