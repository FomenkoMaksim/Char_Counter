package com.foxminded.fomenkomaksim.counter;

import java.util.*;

public class BasicCharCounter implements CharCounter {

    @Override
    public Map<Character, Integer> count(String text) {
        HashMap<Character, Integer> mapUnique = new LinkedHashMap<>();
        char[] chars = text.toCharArray();

        for (char ch : chars) {
            mapUnique.put(ch, mapUnique.getOrDefault(ch, 0)+1);
        }
        return mapUnique;
    }
}
