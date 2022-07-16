package com.foxminded.fomenkomaksim.counter;

import java.util.*;

public class BasicCharCounter implements CharCounter {

    @Override
    public Map<Character, Integer> count(String text) {
        HashMap<Character, Integer> mapUnique = new LinkedHashMap<>();
        char[] chars = text.toCharArray();

        int amount = 1;
        for (char ch : chars) {
            if (mapUnique.containsKey(ch)) {
                mapUnique.put(ch, mapUnique.get(ch) + 1);
            } else {
                mapUnique.put(ch, amount);
            }
        }
        return mapUnique;
    }
}
