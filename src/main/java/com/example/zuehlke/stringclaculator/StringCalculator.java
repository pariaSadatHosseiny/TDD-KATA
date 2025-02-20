package com.example.zuehlke.stringclaculator;

public class StringCalculator {

    public int calculate(String input) {
        int sum = 0;
        if (input.isEmpty()) {
            return sum;
        }

        String delimiter = "[,\n]";

        if (input.startsWith("//")) {
            int newlineIndex = input.indexOf("\n");
            delimiter = input.substring(2, newlineIndex); // Extract delimiter
            input = input.substring(newlineIndex + 1); // Remove the delimiter part
        }

        String[] splittedNumbers = input.split(delimiter);

        for (String stringNum : splittedNumbers) {
            int number = Integer.parseInt(stringNum);
            if (number < 0) {
                throw new NumberFormatException("Negative numbers are not supported");
            }
            sum += number;
        }

        return sum;
    }
}
