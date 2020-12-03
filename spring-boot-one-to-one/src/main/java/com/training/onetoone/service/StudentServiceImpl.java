package com.training.onetoone.service;

import com.training.onetoone.repository.IStudentRepository;
import com.training.onetoone.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {

    @Autowired
    private IStudentRepository repository;

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Optional<Student> findStudent(int idStudent){ return repository.findById(idStudent);}

}
