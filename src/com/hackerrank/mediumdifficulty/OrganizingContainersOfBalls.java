package com.hackerrank.mediumdifficulty;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] res = new String[q];

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            res[qItr] = organizingContainers(container);
        }

        for (String s : res) {
            System.out.println(s);
        }
    }

    static String organizingContainers(int[][] container) {
        List<Integer> capacityPerContainer = new ArrayList<>();
        List<Integer> totalBallsPerColor = new ArrayList<>();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container.length; j++) {
                sum1 += container[i][j];
                sum2 += container[j][i];
            }

            capacityPerContainer.add(sum1);
            totalBallsPerColor.add(sum2);
            sum1 = 0;
            sum2 = 0;
        }

        capacityPerContainer.sort(Comparator.naturalOrder());
        totalBallsPerColor.sort(Comparator.naturalOrder());

        if (capacityPerContainer.equals(totalBallsPerColor)) {
            return "Possible";
        } else
            return "Impossible";
    }
}
