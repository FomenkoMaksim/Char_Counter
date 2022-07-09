package com.foxminded.fomenkomaksim;

import java.util.Map;

public class Printer {
    Counter counter = new Counter();
    StringBuilder sb = new StringBuilder();

    public String printResult(String str) {
        Map<String, Integer> map;

        if (!counter.cache.containsKey(str)) {
            counter.cache.put(str, counter.setMapUnique(str));
        }
        map = counter.cache.get(str);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            sb.append("\"").append(pair.getKey()).append("\"").append(" - ").append(pair.getValue()).append("\n");
        }
        return sb.toString();
    }
}
