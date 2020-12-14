package com.training.today.controller;


import com.training.today.dto.TodayJson;
import com.training.today.service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
@RequestMapping("/v1")
public class TodayController {

    private TodayService todayService;

    @Autowired
    public TodayController(TodayService userService){
        this.todayService = userService;
    }


    @GetMapping("/today")
    public ResponseEntity<String> getToday(){
        return new ResponseEntity<>(todayService.getToday(), HttpStatus.OK);
    }

    @GetMapping("/todayJson")
    public ResponseEntity<TodayJson> getTodayJson(){
        return new ResponseEntity<TodayJson>(todayService.getTodayObject(), HttpStatus.OK);
    }



}
