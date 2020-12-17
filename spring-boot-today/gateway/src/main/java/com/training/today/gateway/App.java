package com.training.today.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class App {

    //@Value("${default.today.uri}")
    private String default_today_uri="http://localhost:7777/";

    //@Value("${fail.today.uri}")
    private String fail_today_uri="http://localhost:8888";

    public static void main (String args[]){
        SpringApplication.run(App.class, args);
    }


    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route(p -> p
                        .path("/v1/todayJso*")
                        .filters(f ->
                                f.addRequestHeader("Spring", "Training")
                                        .hystrix(config -> config
                                                .setName("mycmd")
                                                .setFallbackUri("forward:"+fail_today_uri+"/v1/fail"))
                        )
                        .uri(default_today_uri))
                .build();

    }
}
