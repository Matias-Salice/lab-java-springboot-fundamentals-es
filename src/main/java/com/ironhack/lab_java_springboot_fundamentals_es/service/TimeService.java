package com.ironhack.lab_java_springboot_fundamentals_es.service;

import com.ironhack.lab_java_springboot_fundamentals_es.model.Time;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeService {

    public String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        return timeFormat.format(new Date());
    }

    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
        return dateFormat.format(new Date());
    }

    public String getCurrentDay() {
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        return dayFormat.format(new Date());
    }

    public Time getAllTimeInfo() {
        String time = getCurrentTime();
        String date = getCurrentDate();
        String day = getCurrentDay();
        return new Time(time, date, day);
    }
}
