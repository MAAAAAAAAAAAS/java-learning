package org.example;

public class Zadacha4 {
    public static void main(String[] args) {
        int number = 124543;

        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                int last = number % 10;
                number = number / 10;
                sum = sum + last;
            }
            number = sum;
        }
        System.out.println(number);
    }
}
