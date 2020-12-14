package com.training.today.controller;


import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TodayController {


    public String getToday(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
       LocalDateTime now = LocalDateTime.now();
       return dtf.format(now);

    }


}
