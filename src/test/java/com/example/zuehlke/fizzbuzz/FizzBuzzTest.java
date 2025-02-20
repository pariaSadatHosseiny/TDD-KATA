package com.example.zuehlke.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * FizzBuzz Kata
 * Rules:
 * Print numbers from 1 to 100.
 * If a number is divisible by 3, print "Fizz".
 * If a number is divisible by 5, print "Buzz".
 * If a number is divisible by both 3 and 5, print "FizzBuzz".
 * Otherwise, print the number itself.
 */

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void returnsNumberAsString() {
        assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    void returns2AsString() {
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    void returnsFizzForMultiplesOfThree() {
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void returnsBuzzForMultiplesOfFive() {
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void returnsFizzBuzzForMultiplesOfFifteen() {
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

}
