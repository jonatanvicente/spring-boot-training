package com.training.today.fail.controller;

import com.training.today.fail.dto.FailToday;
import com.training.today.fail.service.FailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class FailController {

    @Autowired
    private FailService failService;


    @GetMapping("/fail")
    public ResponseEntity<FailToday> fail(){
        return new ResponseEntity<FailToday>(failService.getFail(), HttpStatus.OK);
    }


}
