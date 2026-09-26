package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zadacha11 {
    public static void main(String[] args) {
        String string1 = "1 2 34 67 67";
        String string2 = "67 67 1 1 2 67 1 1 1 1 1 34";

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        String[] split1 = string1.split(" ");
        String[] split2 = string2.split(" ");

        int[] array1 = new int[split1.length];
        int[] array2 = new int[split2.length];

        for (int i = 0; i < split1.length; i++) {
            array1[i] = Integer.parseInt(split1[i]);
            list1.add(array1[i]);
        }

        for (int i = 0; i < split2.length; i++) {
            array2[i] = Integer.parseInt(split2[i]);
            list2.add(array2[i]);
        }

        for (int i = 0; i < split1.length; i++) {
            if (list2.contains(array1[i]) && !result.contains(array1[i])) {
                result.add(array1[i]);
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
