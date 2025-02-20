package com.example.zuehlke.fizzbuzz;

public class FizzBuzz {

    StringBuilder result = new StringBuilder();

    public String convert(int number) {
        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        return result.length() == 0 ? String.valueOf(number) : result.toString();
    }
}
