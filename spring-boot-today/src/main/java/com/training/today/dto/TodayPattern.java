package com.training.today.dto;

import org.springframework.stereotype.Component;

@Component
public class TodayPattern {

    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
