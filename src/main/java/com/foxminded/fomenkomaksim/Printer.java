package com.foxminded.fomenkomaksim;

import java.util.Map;

public class Printer {
    Counter counter = new Counter();
    Map<String, Integer> map;


    public void print(String str) {
        map = counter.setMapUnique(str);

        System.out.println(str);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("\"" + pair.getKey() + "\"" + " - " + pair.getValue());
        }
    }
}
