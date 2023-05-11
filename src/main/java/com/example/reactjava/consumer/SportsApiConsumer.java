package com.example.reactjava.consumer;


import com.example.reactjava.client.SportsApiClient;
import com.example.reactjava.repository.SportsRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SportsApiConsumer implements SmartLifecycle {

  private final SportsApiClient apiClient;
  private final SportsRepository repository;

  @Override
  public void start() {
    repository.saveAll(apiClient.getAllSportsData()).blockLast();
  }

  @Override
  public void stop() {}

  @Override
  public boolean isRunning() {
    return false;
  }
}
