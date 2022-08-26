package com.github.he305.animeinfoprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AnimeInfoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimeInfoProviderApplication.class, args);
	}

}
