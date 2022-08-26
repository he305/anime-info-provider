package com.github.he305.animeinfoprovider.domain.model;

import com.github.he305.animeinfoprovider.domain.model.enums.AiringStatus;
import com.github.he305.animeinfoprovider.domain.model.values.AnimeImage;
import com.github.he305.animeinfoprovider.domain.model.values.AnimeTitle;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class AnimeInfo {
    private final AnimeTitle title;
    private final AiringStatus airingStatus;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final AnimeImage image;
    private final int airedSeriesCount;
    private final int totalSeriesCount;
}
