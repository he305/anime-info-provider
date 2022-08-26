package com.github.he305.animeinfoprovider.domain.model;

import com.github.he305.animeinfoprovider.domain.model.enums.AiringStatus;
import com.github.he305.animeinfoprovider.domain.model.values.AnimeImage;
import com.github.he305.animeinfoprovider.domain.model.values.AnimeTitle;
import lombok.Value;

import java.time.LocalDate;

@Value
public class AnimeInfo {
    AnimeTitle title;
    AiringStatus airingStatus;
    LocalDate startDate;
    LocalDate endDate;
    AnimeImage image;
    int airedSeriesCount;
    int totalSeriesCount;
}
