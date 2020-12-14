package com.training.jwt.resourceserver.service;

import java.util.Optional;

import com.training.jwt.resourceserver.persistence.model.Foo;


public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);
    
    Iterable<Foo> findAll();

}
