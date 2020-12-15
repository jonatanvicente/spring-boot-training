package com.training.onetoone.service;

import com.training.onetoone.entity.Student;
import com.training.onetoone.entity.Tuition;
import com.training.onetoone.repository.ITuitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class TuitionServiceImpl implements ITuitionService {

    @Autowired
    private ITuitionRepository repository;

    public List<Tuition> getAllTuitions(){
        return repository.findAll();
    }

    public Optional<Tuition> findTuition(int idTuition){ return repository.findById(idTuition);}




}
