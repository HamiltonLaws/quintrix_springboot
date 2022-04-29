package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
