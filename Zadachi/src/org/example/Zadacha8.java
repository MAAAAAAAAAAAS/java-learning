package org.example;

public class Zadacha8 {
    public static void main(String[] args) {
        String string = "1 4";

        String[] split = string.split(" ");
        int[] arr = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
