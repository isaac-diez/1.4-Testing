package org.level2Exer7.Model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

public class TestOptionalObject {

    @Test
    public void testEmptyOptional() {

        Optional<String> emptyOptional = Optional.empty();

        assertThat(emptyOptional).isEmpty();
    }

    @Test
    public void testNotEmptyOptional() {

        Optional<String> optionalWithValue = Optional.of("Hello World");

        assertThat(optionalWithValue).isPresent();

        assertThat(optionalWithValue).contains("Hello World");
    }
}
