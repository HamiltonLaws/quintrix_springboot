package com.quintrix.springboot.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.collage.Student;
import com.quintrix.springboot.service.StudentServices;

@RestController
public class StudentController {

  private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

  @Autowired
  StudentServices service;

  @GetMapping("/students")
  public List<Student> getStudents() {
    logger.debug("User requests all students");
    return service.getStudents();
  }

  @GetMapping("/studentClasses/{id}")
  public List<String> getClassById(@PathVariable int id) {
    logger.debug("User request class list by student id {}" + id);
    return service.getClassByID(id);
  }

  @GetMapping("/studentSchedule/{id}")
  public List<String> getScheduleById(@PathVariable int id) {
    logger.debug("User requests schedule by student id {} " + id);
    return service.getScheduleById(id);
  }

  @GetMapping("/studentLastName/{name}")
  public List<Student> getByLastName(@PathVariable String name) {
    logger.debug("User requests students with last name {}" + name);
    return service.getByLastName(name);
  }
}
