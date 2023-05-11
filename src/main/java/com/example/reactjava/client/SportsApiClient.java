package com.example.reactjava.client;


import com.example.reactjava.model.Sports;
import com.example.reactjava.model.SportsData;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
@Slf4j
public class SportsApiClient {

  private final WebClient webClient;

  public Flux<Sports> getAllSportsData() {
    return webClient
        .get()
        .uri("/sports")
        .exchangeToMono(resp -> resp.bodyToMono(SportsData.class))
        .doOnError(err -> log.error("error getting response", err))
        .flatMapIterable(SportsData::getData)
        .doOnNext(data -> log.info("sports data {}", data));
  }
}
