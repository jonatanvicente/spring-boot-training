package com.training.onetoone.controller;

import com.training.onetoone.service.StudentServiceImpl;
import com.training.onetoone.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentServiceImpl service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Searching students.....");
    }

    @RequestMapping(value = "/students/all", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> types() {
        List<Student> students = service.getAllStudents();
        return students == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(students);
    }



}
