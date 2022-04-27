package com.quintrix.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.models.Student;
import com.quintrix.springboot.repository.StudentRepository;

@Service
public class StudentServices {
  @Autowired
  StudentRepository repository;

  public List<Student> getStudents() {
    return repository.findAll();
  }
}
