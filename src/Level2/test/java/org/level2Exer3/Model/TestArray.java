package org.level2Exer3.Model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestArray {

    @Test
    public void testArrayIsEqual() {

        int[] array1 ={1,2,3,4,5};
        int[] array2 ={1,2,3,4,5};

        assertThat(array1).isEqualTo(array2);

    }

}
