package com.bootcamp.demo.demo_sb_weather.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_weather.controller.WeatherOperation;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherDTO;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherForecastDTO;
import com.bootcamp.demo.demo_sb_weather.mapper.WeatherForecastMapper;
import com.bootcamp.demo.demo_sb_weather.service.WeatherService;

@RestController

public class WeatherControllerImpl implements WeatherOperation {

 @Autowired
 private WeatherService weatherService;

 @Autowired
 private WeatherForecastMapper forecastMap;

 @Override
 public List<WeatherDTO.WeatherForecastDTO> getForecasts() {
  return weatherService.getForecast().
  getWeatherForecast().stream()//
    .map(weatherForecast -> forecastMap.map(weatherForecast))// forecastMap::map
    .collect(Collectors.toList());
 }

 @Override
 public WeatherDTO getFullForecasts() {
  return 
 }
}
