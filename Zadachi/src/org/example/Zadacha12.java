package org.example;

public class Zadacha12 {
    public static void main(String[] args) {
        String string1 = "1 2 3 4 5 6";
        String string2 = "1 2 7 8 9 10 26 67 67";

        String[] split1 = string1.split(" ");
        String[] split2 = string2.split(" ");

        int[] array1 = new int[split1.length];
        int[] array2 = new int[split2.length];
        int[] result = new int[split1.length + split2.length];

        for (int i = 0; i < split1.length; i++) {
            array1[i] = Integer.parseInt(split1[i]);
        }

        for (int i = 0; i < split2.length; i++) {
            array2[i] = Integer.parseInt(split2[i]);
        }

        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k] = array1[i];
                i++;
                k++;
            } else {
                result[k] = array2[j];
                j++;
                k++;
            }
        }

        while (i < array1.length) {
            result[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            result[k] = array2[j];
            j++;
            k++;
        }

        for (int q = 0; q < result.length; q++) {
            System.out.print(result[q] + " ");
        }
    }
}
