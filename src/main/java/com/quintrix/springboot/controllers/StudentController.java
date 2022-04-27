package com.quintrix.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.Student;
import com.quintrix.springboot.service.StudentServices;

@RestController
public class StudentController {

  @Autowired
  StudentServices service;

  @GetMapping("/students")
  public List<Student> getStudents() {
    return service.getStudents();
  }

}
