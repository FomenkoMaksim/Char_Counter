package com.foxminded.fomenkomaksim;


import java.util.*;

public class Counter {
    Set<Character> uniqueChars;
    Map<String, Integer> mapUnique;

    public Set<Character> findUniqueChars(String string) {
        uniqueChars = new LinkedHashSet<>();
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            uniqueChars.add(ch);
        }
        return uniqueChars;
    }

    public Map<String, Integer> setMapUnique(String string) {
        uniqueChars = findUniqueChars(string);
        mapUnique = new LinkedHashMap<>();
        char[] chars = string.toCharArray();

        int amount = 0;
        for (Character key : uniqueChars) {
            for (Character ch : chars) {
                if (ch.equals(key)) {
                    amount++;
                }
            }
            mapUnique.put(String.valueOf(key), amount);
            amount = 0;
        }
        return mapUnique;
    }
}
