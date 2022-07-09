package com.foxminded.fomenkomaksim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void printResult() {
        Printer printer = new Printer();
        String expected = "\"h\" - 1" + "\n" +
                "\"e\" - 1" + "\n" +
                "\"l\" - 3" + "\n" +
                "\"o\" - 2" + "\n" +
                "\" \" - 1" + "\n" +
                "\"w\" - 1" + "\n" +
                "\"r\" - 1" + "\n" +
                "\"d\" - 1" + "\n" +
                "\"!\" - 1" + "\n";

        String actual = printer.printResult("hello world!");

        assertEquals(expected, actual);
    }
}