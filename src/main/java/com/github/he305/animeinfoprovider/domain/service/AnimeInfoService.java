package com.github.he305.animeinfoprovider.domain.service;

import com.github.he305.animeinfoprovider.domain.model.AnimeInfo;

public interface AnimeInfoService {
    AnimeInfo findAnimeInfoByUrl(String url);

    AnimeInfo findAnimeInfoByTitle(String title);
}
