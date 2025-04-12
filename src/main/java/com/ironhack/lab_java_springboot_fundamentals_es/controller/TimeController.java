package com.ironhack.lab_java_springboot_fundamentals_es.controller;

import com.ironhack.lab_java_springboot_fundamentals_es.model.Time;
import com.ironhack.lab_java_springboot_fundamentals_es.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public String getTime() {
        return "The current time is " + timeService.getCurrentTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return "The current date is " + timeService.getCurrentDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return "The current day is " + timeService.getCurrentDay();
    }

    @GetMapping("/all")
    public Time getAllTimeInfo() {
        return timeService.getAllTimeInfo();
    }
}