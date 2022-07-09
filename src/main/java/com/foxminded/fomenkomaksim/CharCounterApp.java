package com.foxminded.fomenkomaksim;

public class CharCounterApp {
    public static final String STRING = "hello world!";

    public static void main(String[] args) {
        Printer printer = new Printer();
        String result = printer.printResult(STRING);
        System.out.println(STRING);
        System.out.println(result);
    }
}