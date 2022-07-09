package com.foxminded.fomenkomaksim;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    String str = "hello world!";

    @Test
    void shouldReturnOnlyUniqueChars() {
        Counter counter = new Counter();
        Set<String> expected = new HashSet<>();
        expected.add("h");
        expected.add("e");
        expected.add("l");
        expected.add("o");
        expected.add(" ");
        expected.add("w");
        expected.add("r");
        expected.add("d");
        expected.add("!");

        Set<String> actual = counter.findUniqueChars(str);

        assertEquals(expected, actual);
    }

    @Test
    void checkStringForNotNull() {
        assertNotNull(CharCounterApp.STRING);
    }

    @Test
    void shouldCheckMapWithUniqueCharsAndHisValues() {
        Counter counter = new Counter();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("h", 1);
        expected.put("e", 1);
        expected.put("l", 3);
        expected.put("o", 2);
        expected.put(" ", 1);
        expected.put("w", 1);
        expected.put("r", 1);
        expected.put("d", 1);
        expected.put("!", 1);

        Map<String, Integer> actual = counter.setMapUnique(CharCounterApp.STRING);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckMapWithUniqueCharsAndHisValuesIsNotNull() {
        Counter counter = new Counter();
        assertNotNull(counter.setMapUnique(CharCounterApp.STRING));
    }
}