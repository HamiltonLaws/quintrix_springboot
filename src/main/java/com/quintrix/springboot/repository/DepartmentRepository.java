package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
