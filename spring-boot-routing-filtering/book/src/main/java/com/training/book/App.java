package com.training.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

  @RequestMapping(value = "/available")
  public String available() {
    return "Don Quijote";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "El Lazarillo de Tormes";
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
