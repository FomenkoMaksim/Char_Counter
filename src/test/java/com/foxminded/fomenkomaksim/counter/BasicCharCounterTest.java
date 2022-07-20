package com.foxminded.fomenkomaksim.counter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BasicCharCounterTest {
    BasicCharCounter basic = new BasicCharCounter();


    @Test
    void checkBasicCharCounter() {
        Map<Character, Integer> expected = new HashMap<>() {
            {
                put('a', 3);
                put('b', 2);
                put('c', 1);
                put('d', 2);
                put('e', 3);
            }
        };

        Map<Character, Integer> actual = basic.count("aaabbcddeee");

        assertEquals(expected, actual);
    }

    @Test
    void checkBasicCharCounterNotNull() {
        assertNotNull(basic.count("Hello World!"));
    }

}