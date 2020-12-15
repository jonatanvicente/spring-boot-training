package com.training.onetoone.repository;

import com.training.onetoone.entity.Student;
import com.training.onetoone.entity.Tuition;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITuitionRepository extends JpaRepository<Tuition, Integer> {

    @Override
    List<Tuition> findAll();

    Optional<Tuition> findById(Integer idTuition);

}
