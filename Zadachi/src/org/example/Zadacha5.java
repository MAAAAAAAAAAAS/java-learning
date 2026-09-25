package org.example;

public class Zadacha5 {
    public static void main(String[] args) {
        String string = "aaabcccccccddeeeeeeeeeeeeeff";
        char current = string.charAt(0);
        StringBuilder newString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == current) {
                count++;
            } else {
                newString.append(current).append(count);
                current = string.charAt(i);
                count = 1;
            }
        }
        newString.append(current).append(count);
        System.out.println(newString);
    }
}
