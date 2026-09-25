package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Map<Character, Integer> pari = new LinkedHashMap<>();

        for (char c : string.toCharArray()) {
            pari.put(c, pari.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : pari.entrySet()) {
            if (entry.getValue() !=  1) {
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println("нет повторяющихся");
    }
}
