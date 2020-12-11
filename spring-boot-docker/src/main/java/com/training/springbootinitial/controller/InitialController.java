package com.training.springbootinitial.controller;

import com.training.springbootinitial.dto.UserResponseDto;
import com.training.springbootinitial.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.*;

@RestController
@RequestMapping("/v1")
public class InitialController {

    private final IUserService userService;

    @Autowired
    public InitialController(IUserService userService){
        this.userService = userService;
    }

    @ApiOperation(value = "Test service. You can call this to check whether the API is running or not.", tags = "Test")
    @GetMapping("/test")
    public String test() {
        return "Test Passed!!";
    }

    @ApiOperation(value = "User service. Example that shows how to receive params sent", tags = "Params")
    @GetMapping("/user/{name}/{surname}/{gender}")
    public ResponseEntity<UserResponseDto> updatePrescription(
            @ApiParam(name = "name", value = "Name", required = true)
            @PathVariable(name="name") String name,
            @ApiParam(name = "surname", value = "Surname", required = true)
            @PathVariable(name="surname") String surname,
            @ApiParam(name = "gender", value = "Gender", required = true)
            @PathVariable(name="gender") String gender) throws Exception {

        UserResponseDto userResponseDto = userService.getUser(name, surname, gender);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    }


}
