package com.training.today.fail.service;

import com.training.today.fail.dto.FailToday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class FailService {


    private final String DEFAULT_PATTERN = "dd/MM/yy HH:mm:ss";

    @Autowired
    private FailToday failToday;

    public FailToday getFail() {
        failToday.setToday(getToday(DEFAULT_PATTERN));
        return failToday;
    }


    private String getToday(String pattern) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }

}
