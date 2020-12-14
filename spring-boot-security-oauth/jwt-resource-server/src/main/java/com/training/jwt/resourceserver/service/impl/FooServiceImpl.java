package com.training.jwt.resourceserver.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.training.jwt.resourceserver.persistence.model.Foo;
import com.training.jwt.resourceserver.persistence.repository.IFooRepository;
import com.training.jwt.resourceserver.service.IFooService;

@Service
public class FooServiceImpl implements IFooService {

    private IFooRepository fooRepository;

    public FooServiceImpl(IFooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Override
    public Optional<Foo> findById(Long id) {
        return fooRepository.findById(id);
    }

    @Override
    public Foo save(Foo foo) {
        return fooRepository.save(foo);
    }

    @Override
    public Iterable<Foo> findAll() {
        return fooRepository.findAll();
    }
}
