package org.Exercise3.Model;

import org.Level1.Exercise3.Model.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    private Array numbers;

    @BeforeEach
    public void setup() {

        this.numbers = new Array();


    }

    @Test
    public void testIndexOutOfBoundsException() {

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            numbers.getArrayElementByIndex(10);
        });

    }
}