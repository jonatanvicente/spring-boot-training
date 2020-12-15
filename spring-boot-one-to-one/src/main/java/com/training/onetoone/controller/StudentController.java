package com.training.onetoone.controller;

import com.training.onetoone.entity.Tuition;
import com.training.onetoone.service.StudentServiceImpl;
import com.training.onetoone.entity.Student;
import com.training.onetoone.service.TuitionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private TuitionServiceImpl tuitionService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Searching students.....");
    }

    @RequestMapping(value = "/student/all", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> types() {
        List<Student> students = studentService.getAllStudents();
        return students == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(students);
    }

    @RequestMapping(value = "/tuition/all", method = RequestMethod.GET)
    public ResponseEntity<List<Tuition>> tuitions() {
        List<Tuition> tuitions = tuitionService.getAllTuitions();
        return tuitions == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(tuitions);
    }



}
