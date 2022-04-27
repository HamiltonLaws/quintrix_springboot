package com.quintrix.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
  List<Student> findByLastName(String name);
}
