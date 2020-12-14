package com.training.jwt.resourceserver.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.training.jwt.resourceserver.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
