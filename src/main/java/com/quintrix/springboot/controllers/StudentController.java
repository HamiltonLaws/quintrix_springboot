package com.quintrix.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.controllers.models.Student;
import com.quintrix.springboot.service.StudentServices;

@RestController
public class StudentController {

  @Autowired
  private StudentServices service;

  @PostMapping("/addStudent")
  public Student addStudent(@RequestBody Student student) {
    return service.saveStudent(student);
  }

  @PostMapping("/addStudents")
  public List<Student> addStudent(@RequestBody List<Student> student) {
    return service.saveStudents(student);
  }

  @GetMapping("/Students")
  public List<Student> findAllStudents() {
    return service.getStudents();
  }

  @GetMapping("/studentById/{id}")
  public Student findProductById(@PathVariable int id) {
    return service.getStudentById(id);
  }

  // @GetMapping("/studentByLastName/{lastName}")
  // public Student findProductByName(@PathVariable String lastName) {
  // return service.getStudentByLastName(lastName);
  // }

  @PutMapping("/update")
  public Student updateStudent(@RequestBody Student student) {
    return service.updateStudent(student);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteProduct(@PathVariable int id) {
    return service.deleteStudent(id);
  }
}
