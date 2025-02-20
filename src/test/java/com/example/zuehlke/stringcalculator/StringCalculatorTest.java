package com.example.zuehlke.stringcalculator;

import com.example.zuehlke.stringclaculator.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringCalculatorTest {

    /**
     * String Calculator Kata
     * Your task is to implement a method:
     * which takes a comma-separated string of numbers and returns their sum.
     * 1. Support commas and newlines as delimiters.
     * 2. Support custom delimiters (//;\n1;2;3 → 6).
     * 3. Throw an exception for negative numbers ("-1,2,-3" → ❌ "Negatives not allowed: -1, -3").
     */

    StringCalculator calculator = new StringCalculator();

    @Test
    void returnZeroIfEmptyString() {
        assertThat(calculator.calculate("")).isZero();
    }

    @Test
    void returnNumberIfSingleNumberProvided() {
        assertThat(calculator.calculate("5")).isEqualTo(5);
        assertThat(calculator.calculate("24")).isEqualTo(24);
    }

    @Test
    void returnNumberIfMultipleNumbersProvided() {
        assertThat(calculator.calculate("1,2")).isEqualTo(3);
        assertThat(calculator.calculate("5,24")).isEqualTo(29);
        assertThat(calculator.calculate("10,24")).isEqualTo(34);
    }

    @Test
    void handleNewLineAsSeparator() {
        assertThat(calculator.calculate("\n")).isZero();
        assertThat(calculator.calculate("1\n")).isEqualTo(1);
        assertThat(calculator.calculate("1\n2,2")).isEqualTo(5);
    }

    @Test
    void handleCustomDelimiter() {
        assertThat(calculator.calculate("//;\n1;2;3")).isEqualTo(6);
        assertThat(calculator.calculate("//-\n4-5-6")).isEqualTo(15);
        assertThat(calculator.calculate("//#\n10#20#30")).isEqualTo(60);
    }

    @Test
    void negativeNumbersReturnException() {
        assertThatThrownBy(() -> {
            calculator.calculate("-1");
        }).isInstanceOf(NumberFormatException.class)
                .hasMessageContaining("Negative numbers are not supported");
    }
}
