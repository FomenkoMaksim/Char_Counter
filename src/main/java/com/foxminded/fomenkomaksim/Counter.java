package com.foxminded.fomenkomaksim;

import java.util.*;

public class Counter {
    Set<String> uniqueChars;
    Map<String, Map<String, Integer>> cache = new HashMap<>();


    public Set<String> findUniqueChars(String string) {
        uniqueChars = new LinkedHashSet<>();
        String[] words = string.split("");
        uniqueChars.addAll(Arrays.asList(words));
        return uniqueChars;
    }

    public Map<String, Integer> setMapUnique(String string) {
        uniqueChars = findUniqueChars(string);
        HashMap<String, Integer> mapUnique = new LinkedHashMap<>();
        String[] words = string.split("");

        int amount = 0;
        for (String key : uniqueChars) {
            for (String word : words) {
                if (word.equals(key)) {
                    amount++;
                }
            }
            mapUnique.put(String.valueOf(key), amount);
            amount = 0;
        }
        return mapUnique;
    }
}
