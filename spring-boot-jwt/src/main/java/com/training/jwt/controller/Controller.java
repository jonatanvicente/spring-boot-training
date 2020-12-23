package com.training.jwt.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class Controller {

/*	@Secured("ROLE_ADMIN")
	@PreAuthorize("hasRole('ROLE_ADMIN')")//soporta SpEL*/
	@RequestMapping({ "/request" })
	public String hello() {
		return "Ok request with JWT !!! ";
	}

}
