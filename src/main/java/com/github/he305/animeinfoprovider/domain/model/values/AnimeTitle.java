package com.github.he305.animeinfoprovider.domain.model.values;

import lombok.Value;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Value
public class AnimeTitle {
    String mainTitle;
    Set<String> synonyms;

    public AnimeTitle(String mainTitle) {
        this.mainTitle = mainTitle;
        this.synonyms = new HashSet<>();
    }

    public AnimeTitle(String mainTitle, List<String> synonymsList) {
        this.mainTitle = mainTitle;
        this.synonyms = new HashSet<>(synonymsList);
    }

    void addSynonym(String synonym) {
        synonyms.add(synonym);
    }
}
