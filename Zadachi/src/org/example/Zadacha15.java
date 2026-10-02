package org.example;

public class Zadacha15 {
    static void main(String[] args) {
        String string = "-5 -1543 -67";

        String[] split = string.split(" ");
        int[] array = new int[split.length];

        for (int i = 0; i < split.length; i++ ) {
            array[i] = Integer.parseInt(split[i]);
        }

        int n = 0, i = 1;

        boolean[] present = new boolean[array.length + 2];

        while (n < array.length) {
            if (array[n] > 0 && array[n] <= array.length) {
                present[array[n]] = true;
            }
            n++;
        }
        while (i < present.length) {
            if (!present[i]) {
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println(array.length + 1);
    }
}
