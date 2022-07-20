package com.foxminded.fomenkomaksim.counter;

import com.foxminded.fomenkomaksim.cache.Cache;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CachingCharCounterDecoratorTest {
    @Mock
    CharCounter counter;

    @Mock
    Cache<String, Map<Character, Integer>> cache;

    @InjectMocks
    CachingCharCounterDecorator cacheCharCounter;

    final String input = "Hello world!";
    final Map<Character, Integer> expected = new HashMap<>() {
        {
            put('H', 1);
            put('e', 1);
            put('l', 3);
            put('o', 2);
            put(' ', 1);
            put('w', 1);
            put('r', 1);
            put('d', 1);
            put('!', 1);
        }
    };

    @Test
    void shouldGetAnswerFromCache() {
        when(cache.containsKey(input)).thenReturn(true);
        when(cache.get(input)).thenReturn(expected);

        assertEquals(expected, cacheCharCounter.count(input));

        verify(cache).get(input);
        verify(counter, never()).count(any());
        verifyNoMoreInteractions(counter, cache);
    }

    @Test
    void shouldCountIfCacheDontHaveResult() {
        when(cache.containsKey(input)).thenReturn(false);
        when(cache.get(input)).thenReturn(expected);
        when(counter.count(input)).thenReturn(expected);

        assertEquals(expected, cacheCharCounter.count(input));

        verify(cache).put(input, expected);
        verify(cache).get(anyString());
        verifyNoMoreInteractions(cache);
    }
}