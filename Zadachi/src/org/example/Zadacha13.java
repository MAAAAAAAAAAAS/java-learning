package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zadacha13 {
    public static void main(String[] args) {
        String string1 = "1 2 3 4 5 6 7 67 69";
        String string2 = "1 2 5 7 8 9 10 26 67 67 68";

        String[] split1 = string1.split(" ");
        String[] split2 = string2.split(" ");

        int[] array1 = new int[split1.length];
        int[] array2 = new int[split2.length];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < split1.length; i++) {
            array1[i] = Integer.parseInt(split1[i]);
        }

        for (int i = 0; i < split2.length; i++) {
            array2[i] = Integer.parseInt(split2[i]);
        }

        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j] && !result.contains(array1[i])) {
                result.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                i++;
            }
        }

        for (int q : result) {
            System.out.print(q + " ");
        }
    }
}
