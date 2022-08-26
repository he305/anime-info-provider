package com.github.he305.animeinfoprovider.domain.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class AnimeInfoTest {

    @Test
    void testEquals() {
        EqualsVerifier.simple().forClass(AnimeInfo.class).verify();
    }
}