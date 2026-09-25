package org.example;

import java.util.Arrays;

import java.util.*;

public class Zadacha2 {
    public static void main(String[] args) {
        String string1 = "1 3 5 12 51 67";
        String string2 = "1 5 43 67 67";

        String[] split1 = string1.split(" ");
        String[] split2 = string2.split(" ");

        Set<Integer> second = new HashSet<>();

        for (String s : split2) {
            second.add(Integer.parseInt(s));
        }

        Set<Integer> result = new LinkedHashSet<>();

        for (String s : split1) {
            int n = Integer.parseInt(s);
            if (second.contains(n)) {
                result.add(n);
            }
        }
        System.out.println(result);

        String string3 = "Привет мир!";
        String string4 = "Приевт мир!";
        //String glasnie = "аеёиоуыэюяaeiou";

        //int count1 = 0;
        //int count2 = 0;
        
        String st3 = string3.toLowerCase().replace(" ","");
        String st4 = string4.toLowerCase().replace(" ","");

        //for (char c : st3.toCharArray()) {
        //    if (glasnie.contains(String.valueOf(c))) {
        //        count1++;
        //    }
        //}

        //for (char c : st4.toCharArray()) {
        //    if (glasnie.contains(String.valueOf(c))) {
        //        count2++;
        //    }
        //}
        //System.out.println("гласных в первой фразе: " + count1 + ", гласных во втрой фразе: " + count2);
        char[] arr1 = st3.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = st4.toCharArray();
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println(isAnagram);
    }
}
