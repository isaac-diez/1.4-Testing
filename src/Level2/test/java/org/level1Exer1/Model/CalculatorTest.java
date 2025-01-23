package org.level1Exer1.Model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void testIntegersEquals() {

        int a = 3;
        int b = 3;

        assertThat(a).isEqualTo(b);

    }

    @Test
    void testIntegersNotEquals() {

        int a = 3;
        int b = 4;

        assertThat(a).isNotEqualTo(b);

    }

}