package com.foxminded.fomenkomaksim;

import com.foxminded.fomenkomaksim.counter.BasicCharCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {
    @Test
    void apply() {
        BasicCharCounter basic = new BasicCharCounter();
        Formatter formatter = new Formatter();

        String text = "aaabbcddeee";

        String expected = text + "\n" +
                "\"a\" - 3" + "\n" +
                "\"b\" - 2" + "\n" +
                "\"c\" - 1" + "\n" +
                "\"d\" - 2" + "\n" +
                "\"e\" - 3" + "\n";



        String actual = formatter.apply(basic.count(text), text);

        assertEquals(expected, actual);
    }
}