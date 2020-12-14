package com.training.today.service;

import com.training.today.dto.TodayJson;
import com.training.today.dto.TodayPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class TodayService {

    @Autowired
    private TodayJson todayJson;

    private final String DEFAULT_PATTERN = "dd/MM/yy HH:mm:ss";

    public String getToday(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DEFAULT_PATTERN);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public TodayJson getTodayObject(){
        todayJson.setToday(getToday());
        return todayJson;
    }

    public TodayJson getTodayParameterized(TodayPattern pattern){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern.getPattern());
        LocalDateTime now = LocalDateTime.now();
        todayJson.setToday(dtf.format(now));
        return todayJson;
    }


}
