package com.training.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/available")
    public String available() {
        return "Don Quijote";
    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        return "El Lazarillo de Tormes";
    }

}
