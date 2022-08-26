package com.github.he305.animeinfoprovider.domain.model.values;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnimeTitleTest {

    @Test
    void equals() {
        EqualsVerifier.simple().forClass(AnimeTitle.class).verify();
    }

    @Test
    void addSynonym() {
        AnimeTitle title = new AnimeTitle("main", List.of());
        List<String> synonyms = List.of(
                "test",
                "test",
                "test1"
        );

        Set<String> addedSynonyms = title.getSynonyms();
        assertTrue(addedSynonyms.isEmpty());
        synonyms.forEach(title::addSynonym);
        Set<String> afterAddedSynonyms = title.getSynonyms();
        assertEquals(2, afterAddedSynonyms.size());
    }

    @Test
    void emptyConstructor() {
        AnimeTitle title = new AnimeTitle("mainTitle");
        Set<String> synonyms = title.getSynonyms();
        assertTrue(synonyms.isEmpty());
    }
}