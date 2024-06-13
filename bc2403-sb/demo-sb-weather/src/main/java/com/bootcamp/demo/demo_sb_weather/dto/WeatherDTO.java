package com.bootcamp.demo.demo_sb_weather.dto;

import java.util.List;
import com.bootcamp.demo.demo_sb_weather.model.WeatherResponse.WeatherForecast;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDTO {
  private String generalSituation;
  private List<WeatherDTO.WeatherForecastDTO> weatherForecast;

  @Getter
  @Builder
  public static class WeatherForecastDTO {
    private String forecastDate;
    private String week;
    // private String forecastWind;
    private String forecastWeather;
    private TemperatureDTO forecastMaxtemp;
    private TemperatureDTO forecastMintemp;
    private HumidityDTO forecastMaxrh;
    private HumidityDTO forecastMinrh;
    // private int ForecastIcon;
    // private String psr;

    @Getter
    @Builder
    public static class TemperatureDTO {
      private int value;
      private String unit;
    }

    @Getter
    @Builder
    public static class HumidityDTO {
      private int value;
      private String unit;
    }
  }

}


