package com.training.jwt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class Controller {

	@RequestMapping({ "/request" })
	public String hello() {
		return "Ok request with JWT !!! ";
	}

}
