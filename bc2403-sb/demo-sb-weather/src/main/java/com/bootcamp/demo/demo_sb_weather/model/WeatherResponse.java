package com.bootcamp.demo.demo_sb_weather.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class WeatherResponse {
 private String generalSituation;
 private List<WeatherForecast> weatherForecast;
 private String updateTime;
 private SeaTemp seaTemp;
 private List<SoilTemp> soilTemp;

 @Getter
 @Builder
 public static class WeatherForecast {
  private String forecastDate;
  private String week;
  private String forecastWind;
  private String forecastWeather;
  private Temperature forecastMaxtemp;
  private Temperature forecastMintemp;
  private Humidity forecastMaxrh;
  private Humidity forecastMinrh;
  private int ForecastIcon;
  private String psr;

  @Getter
  @Builder
  public static class Temperature {
   private int value;
   private String unit;
  }

  @Getter
  @Builder
  public static class Humidity {
   private int value;
   private String unit;
  }
 }

 @Getter
 @Builder
 public static class SeaTemp {
  private String place;
  private int value;
  private String unit;
  private String recordTime;
 }

 @Getter
 @Builder
 public static class SoilTemp {
  private String place;
  private double value;
  private String unit;
  private String recordTime;
  private Depth depth;

  @Getter
  @Builder
  public static class Depth {
   private String unit;
   private double value;
  }
 }

}
