package com.foxminded.fomenkomaksim.counter;

import com.foxminded.fomenkomaksim.cache.Cache;

import java.util.Map;

public class CachingCharCounterDecorator implements CharCounter {

    private final CharCounter charCounter;
    private final Cache<String, Map<Character, Integer>> cache;

    // all args constructor

    public CachingCharCounterDecorator(CharCounter charCounter, Cache<String, Map<Character, Integer>> cache) {
        this.charCounter = charCounter;
        this.cache = cache;
    }

    @Override
    public Map<Character, Integer> count(String text) {
        if (cache.containsKey(text)) {
            return cache.get(text);
        } else {
            cache.put(text, charCounter.count(text));
            return charCounter.count(text);
        }
    }
}

