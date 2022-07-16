package com.foxminded.fomenkomaksim;

import com.foxminded.fomenkomaksim.counter.BasicCharCounter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasicCharCounterTest {

    @Test
    void shouldCheckMapWithUniqueCharsAndHisValues() {
        BasicCharCounter basicCharCounter = new BasicCharCounter();
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('l', 3);
        expected.put('o', 2);
        expected.put(' ', 1);
        expected.put('w', 1);
        expected.put('r', 1);
        expected.put('d', 1);
        expected.put('!', 1);

        Map<Character, Integer> actual = basicCharCounter.count(CharCounterApp.TEXT);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckMapWithUniqueCharsAndHisValuesIsNotNull() {
        BasicCharCounter basicCharCounter = new BasicCharCounter();
        assertNotNull(basicCharCounter.count(CharCounterApp.TEXT));
    }
}