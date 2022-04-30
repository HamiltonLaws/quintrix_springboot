package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Semester;

public interface SemesterRepository extends JpaRepository<Semester, Integer> {

}
