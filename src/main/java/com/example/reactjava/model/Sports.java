package com.example.reactjava.model;

import lombok.Data;

import java.util.Map;
import java.util.Objects;

@Data
public class Sports {

  private String id;
  private String type;
  private Map<String, Object> attributes;
}
