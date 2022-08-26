package com.github.he305.animeinfoprovider.domain.model.values;

import lombok.Getter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class AnimeTitle {
    private final String mainTitle;
    private final Set<String> synonyms;

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
