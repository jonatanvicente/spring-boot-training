package com.training.today.fail.dto;

import org.springframework.stereotype.Component;

@Component
public class FailToday {

    private String today;
    private final String failMessage = "This date is fail Message";


    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getFailMessage() {
        return failMessage;
    }


}
