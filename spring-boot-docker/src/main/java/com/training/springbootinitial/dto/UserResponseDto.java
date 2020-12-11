package com.training.springbootinitial.dto;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@Component
public class UserResponseDto extends ResponseDto{

    @ApiModelProperty(dataType = "java.lang.String", required = true)
    private String name;
    @ApiModelProperty(dataType = "java.lang.String", required = true)
    private String surname;
    @ApiModelProperty(dataType = "java.lang.String", required = false)
    private String dateOfBirth;
    @ApiModelProperty(dataType = "java.lang.String", required = true)
    private String gender;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
}