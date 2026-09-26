package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zadacha10 {
    static void main(String[] args) {
        String string = "5 5 5 5 5 5";
        int chislo = 5;
        List<Integer> result = new ArrayList<>();

        String[] split = string.split(" ");
        int[] array = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != chislo) {
                result.add(array[i]);
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
