package com.ironhack.lab_java_springboot_fundamentals_es.controller;

import com.ironhack.lab_java_springboot_fundamentals_es.model.Weather;
import com.ironhack.lab_java_springboot_fundamentals_es.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public String getTemperature() {
        int temperature = weatherService.getTemperature();
        return "The current temperature is " + temperature + "º";
    }

    @GetMapping("/condition")
    public String getCondition() {
        String condition = weatherService.getCondition();
        return "The current weather condition is " + condition;
    }

    @GetMapping("/wind")
    public String getWindSpeed() {
        int windSpeed = weatherService.getWindSpeed();
        return "The current wind speed is " + windSpeed + " km/h";
    }

    @GetMapping("/all")
    public String getAllWeatherInfo() {
        int temperature = weatherService.getTemperature();
        String condition = weatherService.getCondition();
        int windSpeed = weatherService.getWindSpeed();
        return "Temperature: " + temperature + ", Condition: " + condition + ", Wind Speed: " + windSpeed + " km/h";
    }
}
