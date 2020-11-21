package com.hackerrank.easydifficulty;

import java.util.*;

public class MigratoryBirds {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        List<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        System.out.println(migratoryBirds(arr));
    }

    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = convertListToMap(arr);
        int max = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            if (element.getValue() == max) {
                return element.getKey();
            }
        }

        return -1;
    }

    static Map<Integer, Integer> convertListToMap(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (Integer element : list) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        return map;
    }
}
