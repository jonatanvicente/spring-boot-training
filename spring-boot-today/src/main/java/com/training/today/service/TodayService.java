package com.training.today.service;

import com.training.today.dto.TodayJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TodayService {

    @Autowired
    private TodayJson todayJson;

    public String getToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public TodayJson getTodayObject(){
        todayJson.setToday(getToday());
        return todayJson;
    }


}
