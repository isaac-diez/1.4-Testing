package org.level2Exer5.Model;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestMap {

    @Test
    public void testMapContainsGivenKey(){

        Map<String, Integer> testMap = new HashMap<>();

        testMap.put("banana", 15);
        testMap.put("apple", 5);
        testMap.put("pineapple", 20);
        testMap.put("coconut", 10);
        testMap.put("mango", 25);

        assertThat(testMap).containsKey("mango");

    }
}
