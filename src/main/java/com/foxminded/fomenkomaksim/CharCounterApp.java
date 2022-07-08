package com.foxminded.fomenkomaksim;

public class CharCounterApp {
    private static final String STRING = "hello world!";

    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(STRING);
        printer.printResult(STRING);
    }
}