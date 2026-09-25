package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Zadacha3 {
    public static void main(String[] args) {
        String string = "programming";

        Set<Character> unique = new LinkedHashSet<>();

        for (char c : string.toCharArray()) {
            unique.add(c);
        }

        for (char c : unique) {
            System.out.print(c);
        }
    }
}
