package com.foxminded.fomenkomaksim;

import com.foxminded.fomenkomaksim.counter.BasicCharCounter;
import com.foxminded.fomenkomaksim.counter.CharCounter;

import java.util.Map;

public class CharCounterApp {
    public static final String TEXT = "hello world!";

    public static void main(String[] args) {

        CharCounter basic = new BasicCharCounter();
        Formatter formatter = new Formatter();

        Map<Character, Integer> result = basic.count(TEXT);

        String formatted = formatter.apply(result, TEXT);

        System.out.println(formatted);
    }
}