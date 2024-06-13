package com.bootcamp.demo.demo_sb_weather.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo.demo_sb_weather.infra.Scheme;
import com.bootcamp.demo.demo_sb_weather.infra.UrlBuilder;
import com.bootcamp.demo.demo_sb_weather.model.WeatherResponse;
import com.bootcamp.demo.demo_sb_weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

  @Value(value = "${api.weather.domain}")
  private String domain;

  @Value(value = "${api.weather.endpoints.forecast}")
  private String forecastEndpoint;

  @Value(value = "${api.weather.params.dataType}")
  private String dataType;

  @Value(value = "${api.weather.params.lang}")
  private String lang;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public WeatherResponse getForecast() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme(Scheme.HTTPS.lowerCase())//
        .host(domain)//
        .path(forecastEndpoint)//
        .queryParam("dataType", dataType)//
        .queryParam("lang", lang)//
        .toUriString();
    WeatherResponse weatherResponse =
        restTemplate.getForObject(url, WeatherResponse.class);
    return weatherResponse;
  }



}
