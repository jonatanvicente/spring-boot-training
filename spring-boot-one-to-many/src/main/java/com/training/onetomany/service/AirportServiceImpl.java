package com.training.onetomany.service;

import com.training.onetomany.entity.Airport;
import com.training.onetomany.repository.IAirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl {

    @Autowired
    private IAirportRepository repository;

    public List<Airport> getAllStudents(){
        return repository.findAll();
    }

    public Optional<Airport> findAirport(String iata){ return repository.findById(iata);}
}
