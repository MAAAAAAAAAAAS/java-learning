package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zadacha14 {
    public static void main(String[] args) {
        String string = "1 1 1 4 6 6 8 9 124 577 777 777 6767 6767 676767 676767";

        String[] split = string.split(" ");
        int[] array = new int[split.length];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        result.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                result.add(array[i]);
            }
        }

        System.out.println(result);

        int j = 1;
        int i = 0;

        while (j < array.length) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
            j++;
        }

        for (int q = 0; q <= i; q++) {
            System.out.print(array[q] + " ");
        }
    }
}
