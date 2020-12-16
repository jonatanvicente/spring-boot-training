package com.training.onetomany.controller;


import com.training.onetomany.entity.Airport;
import com.training.onetomany.service.AirportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightsController {

    @Autowired
    private AirportServiceImpl service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Searching flights.....");
    }


    @RequestMapping(value = "/airport/all", method = RequestMethod.GET)
    public ResponseEntity<List<Airport>> getAllAirports() {
        List<Airport> airports = service.getAllAirports();
        return airports == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(airports);
    }

    @RequestMapping(value = "/airport/departures", method = RequestMethod.GET)
    public ResponseEntity<Airport> getOriginInfo() {

        //TODO - falta capturar el parámetro....
        Optional<Airport> airport = service.findAirport("HOU");
        return ResponseEntity.ok(airport.get());
    }

}
