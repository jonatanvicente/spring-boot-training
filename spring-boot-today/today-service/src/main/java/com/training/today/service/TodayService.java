package com.training.today.service;

import com.training.today.dto.TodayJson;
import com.training.today.dto.TodayPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TodayService {

    @Autowired
    private TodayJson todayJson;

    private final String DEFAULT_PATTERN = "dd/MM/yy HH:mm:ss";


    public String getTodaySimple(){
        return getToday(DEFAULT_PATTERN);
    }

    public TodayJson getTodayObject(){
        todayJson.setToday(getToday(DEFAULT_PATTERN));
        return todayJson;
    }

    public TodayJson getTodayParameterized(TodayPattern pattern){
        todayJson.setToday(getToday(pattern.getPattern()));
        return todayJson;
    }

    private String getToday(String pattern){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
