package com.example.reactjava.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "web")
public class WebClientProps {

  private String baseUrl;
}
