package com.quintrix.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.controllers.models.Student;
import com.quintrix.springboot.repository.StudentRepository;

@Service
public class StudentServices {
  @Autowired
  private StudentRepository repository;

  public Student saveStudent(Student student) {
    return repository.save(student);
  }

  public List<Student> saveStudents(List<Student> student) {
    return repository.saveAll(student);
  }

  public List<Student> getStudents() {
    return repository.findAll();
  }

  public Student getStudentById(int id) {
    return repository.findById(id).orElse(null);
  }

  // public Student getStudentByLastName(String lastName) {
  // return repository.findByLastName(lastName);
  // }

  public String deleteStudent(int id) {
    repository.deleteById(id);
    return "product removed !! " + id;
  }


  public Student updateStudent(Student student) {
    Student existingProduct = repository.findById(student.getID()).orElse(null);
    existingProduct.setLastName(student.getLastName());
    existingProduct.setFirstName(student.getFirstName());
    existingProduct.setSex(student.getSex());
    existingProduct.setDateOfBirth(student.getDateOfBirth());
    existingProduct.setEnrolledDate(student.getEnrolledDate());
    existingProduct.setEmail(student.getEmail());
    // existingProduct.setMajorID(student.getMajorID());
    existingProduct.setScholarship(student.getScholarship());
    return repository.save(existingProduct);
  }
}
