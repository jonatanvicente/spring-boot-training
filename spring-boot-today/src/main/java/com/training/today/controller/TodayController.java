package com.training.today.controller;


import com.training.today.dto.TodayJson;
import com.training.today.dto.TodayPattern;
import com.training.today.service.TodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Api(value = "Spring Boot Today API", tags = {"Today"})
@RestController
@RequestMapping("/v1")
public class TodayController {

    private TodayService todayService;

    @Autowired
    public TodayController(TodayService userService){
        this.todayService = userService;
    }

    @ApiOperation(value = "You can call this to get date", tags = "Get Date")
    @GetMapping("/today")
    public ResponseEntity<String> getToday(){
        return new ResponseEntity<>(todayService.getToday(), HttpStatus.OK);
    }

    @ApiOperation(value = "You can call this to get date in JSON format", tags = "Get Date")
    @GetMapping("/todayJson")
    public ResponseEntity<TodayJson> getTodayJson(){
        return new ResponseEntity<TodayJson>(todayService.getTodayObject(), HttpStatus.OK);
    }

    @ApiOperation(value = "You can call this to get date in JSON format", tags = "Get Date")
    @GetMapping("/todayJsonParameterized")
    public ResponseEntity<TodayJson> getTodayJsonWithParam(@RequestBody TodayPattern pattern){
        return new ResponseEntity<TodayJson>(todayService.getTodayParameterized(pattern), HttpStatus.OK);
    }

}
