package com.hackerrank.mediumdifficulty;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scanner = new Scanner(System.in);

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
        bufferedWriter.close();

        scanner.close();
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] aliceRanks = new int[alice.length];
        int[] ladder = IntStream.of(scores).distinct().sorted().toArray();
        int index = 0;

        for (int i = 0; i < alice.length; i++) {
            for (int j = index; j < ladder.length; j++) {
                if (alice[i] < ladder[j]) {
                    aliceRanks[i] = ladder.length + 1;
                    break;
                } else if (alice[i] == ladder[j]) {
                    aliceRanks[i] = ladder.length - j;
                    index = j;
                    break;
                } else if (alice[i] < ladder[j + 1]) {
                    aliceRanks[i] = ladder.length - j;
                    index = j;
                    break;
                } else if (j == ladder.length - 2) {
                    aliceRanks[i] = 1;
                    break;
                }
            }
        }

        return aliceRanks;
    }
}