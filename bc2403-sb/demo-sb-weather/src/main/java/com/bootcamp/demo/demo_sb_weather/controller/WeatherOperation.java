package com.bootcamp.demo.demo_sb_weather.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherDTO;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherForecastDTO;

public interface WeatherOperation {
 @GetMapping(value = "/forecast")
 List<WeatherDTO.WeatherForecastDTO> getForecasts();

 @GetMapping(value = "/weather/forecast")
 WeatherDTO getFullForecasts();
}
