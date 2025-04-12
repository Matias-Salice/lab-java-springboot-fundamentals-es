package com.ironhack.lab_java_springboot_fundamentals_es.service;

import com.ironhack.lab_java_springboot_fundamentals_es.model.Weather;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();


    public int getTemperature() {
        return random.nextInt(51) - 10; // Aleatorio entre -10 y 40
    }

    public String getCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed() {
        return random.nextInt(101); // Aleatorio entre 0 y 100
    }
}
