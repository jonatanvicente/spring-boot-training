package com.training.onetoone.service;

import com.training.onetoone.entity.Student;
import com.training.onetoone.entity.Tuition;

import java.util.List;
import java.util.Optional;

public interface ITuitionService {

    public List<Tuition> getAllTuitions();

    public Optional<Tuition> findTuition(int tuition_id);


}
