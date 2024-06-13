package com.bootcamp.demo.demo_sb_weather.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherDTO;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherForecastDTO;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherForecastDTO.HumidityDTO;
import com.bootcamp.demo.demo_sb_weather.dto.WeatherForecastDTO.TemperatureDTO;
import com.bootcamp.demo.demo_sb_weather.model.WeatherResponse;
import com.bootcamp.demo.demo_sb_weather.model.WeatherResponse.WeatherForecast;

@Component
public class WeatherForecastMapper {

 public WeatherDTO.WeatherForecastDTO map(WeatherResponse.WeatherForecast wf) {
  WeatherDTO.WeatherForecastDTO.TemperatureDTO maxTemDTO =
    WeatherDTO.WeatherForecastDTO.TemperatureDTO.builder()//
      .value(wf.getForecastMaxtemp().getValue())//
      .unit(wf.getForecastMaxtemp().getUnit())//
      .build();

  WeatherDTO.WeatherForecastDTO.TemperatureDTO minTemDTO =
    WeatherDTO.WeatherForecastDTO.TemperatureDTO.builder()//
      .value(wf.getForecastMintemp().getValue())//
      .unit(wf.getForecastMintemp().getUnit())//
      .build();

  WeatherDTO.WeatherForecastDTO.HumidityDTO maxRhDTO =
    WeatherDTO.WeatherForecastDTO.HumidityDTO.builder()//
      .value(wf.getForecastMaxrh().getValue())//
      .unit(wf.getForecastMaxrh().getUnit())//
      .build();

  WeatherDTO.WeatherForecastDTO.HumidityDTO minRhDTO =
    WeatherDTO.WeatherForecastDTO.HumidityDTO.builder()//
      .value(wf.getForecastMinrh().getValue())//
      .unit(wf.getForecastMinrh().getUnit())//
      .build();

  return WeatherDTO.WeatherForecastDTO.builder()//
    .forecastDate(wf.getForecastDate())//
    .week(wf.getWeek())//
    .forecastWeather(wf.getForecastWeather())//
    .forecastMaxtemp(maxTemDTO)//
    .forecastMintemp(minTemDTO)//
    .forecastMaxrh(maxRhDTO)//
    .forecastMinrh(minRhDTO)//
    .build();
 }

 public WeatherDTO map(WeatherResponse weatherResponse) {
  List<WeatherDTO.WeatherForecastDTO> convertList =
    weatherResponse.getWeatherForecast().stream()//
      .map(e -> this.map(e))//
      .collect(Collectors.toList());

  WeatherDTO result = new WeatherDTO();
  result.setWeatherForecast(convertList);
  return result;
  // return WeatherDTO.builder()//
  // .weatherForecast(convertList)//
  // .build();
 }
}
