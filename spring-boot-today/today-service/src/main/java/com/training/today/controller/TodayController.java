package com.training.today.controller;


import com.training.today.dto.TodayJson;
import com.training.today.dto.TodayPattern;
import com.training.today.service.TodayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return new ResponseEntity<>(todayService.getTodaySimple(), HttpStatus.OK);
    }

    @ApiOperation(value = "You can call this to get today's date in JSON format", tags = "Get Today's Date")
    @GetMapping("/todayJson")
    public ResponseEntity<TodayJson> getTodayJson(){

        return new ResponseEntity<TodayJson>(todayService.getTodayObject(), HttpStatus.OK);
    }

    /**
     * Input Format example:
     *      {
     *     "pattern": "dd/MM/yyyy HH:mm:ss"
     *      }
     * @param pattern
     * @return
     */
    @ApiOperation(value = "You can call this to get today's date in JSON format", tags = "Get Today's Date")
    @GetMapping("/todayJsonParameterized")
    public ResponseEntity<TodayJson> getTodayJsonWithParam(@RequestBody TodayPattern pattern){
        return new ResponseEntity<TodayJson>(todayService.getTodayParameterized(pattern), HttpStatus.OK);
    }


    @ApiOperation(value = "Test", tags = "Test")
    @GetMapping("/badGatewayTest")
    public ResponseEntity<TodayJson> getBadGateway(){
        return new ResponseEntity<>(null, HttpStatus.BAD_GATEWAY);
    }

}
