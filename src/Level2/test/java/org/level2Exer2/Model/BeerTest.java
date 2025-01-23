package org.level2Exer2.Model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeerTest {

    @Test
    public void testObjectReferenceEqual() {

        Beer beer1 = new Beer("Estrella Damm", 4.5);
        Beer beer2 = new Beer("Estrella Damm", 4.5);

        assertThat(beer1).isEqualTo(beer2);

    }

    @Test
    public void testObjectReferenceNotEqual() {

        Beer beer1 = new Beer("Estrella Damm", 4.5);
        Beer beer2 = new Beer("Estrella Galicia", 4.3);

        assertThat(beer1).isNotEqualTo(beer2);

    }

}