package org.example;

public class Zadacha9 {
    public static void main(String[] args) {
        String string = "5 1 3 5 12 5664";
        String[] split = string.split(" ");
        int[] array = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        int first = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = first;

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
