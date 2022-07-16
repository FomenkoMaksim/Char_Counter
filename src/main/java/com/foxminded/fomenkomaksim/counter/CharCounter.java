package com.foxminded.fomenkomaksim.counter;

import java.util.Map;

public interface CharCounter {
    Map<Character, Integer> count(String text);
}