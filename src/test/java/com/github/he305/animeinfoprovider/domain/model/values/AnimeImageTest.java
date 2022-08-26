package com.github.he305.animeinfoprovider.domain.model.values;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimeImageTest {

    @Test
    void testEquals() {
        EqualsVerifier.simple().forClass(AnimeImage.class).verify();
    }

    @Test
    void constructor() {
        AnimeImage image = new AnimeImage("url");
        assertEquals("url", image.getMainImageUrl());
    }

}