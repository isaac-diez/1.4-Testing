package org.level2Exer6.Model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class TestArray {

    @Test
    public void testLaunchArrayIndexOutOfBoundsException() {

        int[] numbers = new int[]{1,2,3,4,5};

        try{
            int number = numbers[5];
        } catch (IndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(IndexOutOfBoundsException.class);
        }

    }

}