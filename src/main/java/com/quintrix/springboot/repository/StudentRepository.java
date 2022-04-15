package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.controllers.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
  // Student findByLastName(String LastName);
}
