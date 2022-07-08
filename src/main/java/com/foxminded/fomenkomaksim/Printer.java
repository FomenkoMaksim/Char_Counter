package com.foxminded.fomenkomaksim;

import java.util.Map;

public class Printer {
    Counter counter = new Counter();

    public void printResult(String str) {
        Map<String, Integer> map;

        if (!counter.cache.containsKey(str)) {
            counter.cache.put(str, counter.setMapUnique(str));
        }
        map = counter.cache.get(str);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\"" + " - " + pair.getValue());
        }
    }
}
