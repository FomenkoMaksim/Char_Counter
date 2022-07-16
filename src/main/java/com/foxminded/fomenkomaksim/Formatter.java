package com.foxminded.fomenkomaksim;

import java.util.Map;

public class Formatter {
    StringBuilder sb = new StringBuilder();

    public String apply(Map<Character, Integer> result) {
        sb.append(CharCounterApp.TEXT).append("\n");
        result.forEach((key, value) -> sb.append("\"").append(key).append("\" - ").append(value).append("\n"));
        return sb.toString();
    }
}
