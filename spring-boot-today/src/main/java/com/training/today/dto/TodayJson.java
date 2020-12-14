package com.training.today.dto;

import org.springframework.stereotype.Component;

@Component
public class TodayJson {

    private String today;

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }
}
