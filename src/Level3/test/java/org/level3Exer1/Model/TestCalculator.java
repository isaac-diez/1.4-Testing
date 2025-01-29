package org.level3Exer1.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestCalculator {

    private Calculator casio;

    @BeforeEach
    public void initial() {

        casio = new Calculator();
    }

    @Test
    public void testSumOfTwoDoubleNumbers() {

        Double sum = casio.add(3.0,5.5);

        assertThat(sum).isEqualTo(8.5);
    }

    @Test
    public void testSubtractionOfTwoDoubleNumbers() {

        Double subtraction = casio.subtract(8.2,4.4);

        assertThat(subtraction).isCloseTo(3.8, within(0.0001));
    }

    @Test
    public void testMultiplicationOfTwoDoubleNumbers() {

        Double multiply = casio.multiply(5.2,4.4);

        assertThat(multiply).isCloseTo(22.88, within(0.0001));
    }

    @Test
    public void testDivisionOfTwoDoubleNumbers() {

        Double divide = casio.divide(12.2,2.5);

        assertThat(divide).isCloseTo(4.88, within(0.0001));
    }

    @Test
    public void testDivisionByZero() {

        assertThatThrownBy(() -> casio.divide(12.2,0.0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Can't divide by 0");
    }




}
