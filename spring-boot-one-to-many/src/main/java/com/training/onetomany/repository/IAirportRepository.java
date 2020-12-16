package com.training.onetomany.repository;

import com.training.onetomany.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IAirportRepository extends JpaRepository<Airport, String> {

    List<Airport> findAll();

    Optional<Airport> findById(String iata);

}
