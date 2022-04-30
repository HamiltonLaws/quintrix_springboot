package com.quintrix.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.collage.Student;
import com.quintrix.springboot.service.StudentServices;

@RestController
public class StudentController {

  @Autowired
  StudentServices service;

  @GetMapping("/students")
  public List<Student> getStudents() {
    return service.getStudents();
  }

  @GetMapping("/studentClassesById/{id}")
  public List<String> getClassById(@PathVariable int id) {
    return service.getClassByID(id);
  }

  @GetMapping("/studentSchedule/{id}")
  public List<String> getScheduleById(@PathVariable int id) {
    return service.getScheduleById(id);
  }

  @GetMapping("/studentLastName/{name}")
  public List<Student> getByLastName(@PathVariable String name) {
    return service.getByLastName(name);
  }
}
