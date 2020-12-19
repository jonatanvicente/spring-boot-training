package com.training.today.gateway;

import org.eclipse.jgit.attributes.FilterCommandRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;
import wiremock.org.eclipse.jetty.servlet.FilterHolder;

@SpringBootApplication
public class App {


    public static void main (String args[]){
        SpringApplication.run(App.class, args);
    }


}
