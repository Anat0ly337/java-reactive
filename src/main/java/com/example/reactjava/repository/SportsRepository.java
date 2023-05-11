package com.example.reactjava.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.reactjava.model.Sports;

@Repository
public interface SportsRepository extends ReactiveMongoRepository<Sports, String> {}
