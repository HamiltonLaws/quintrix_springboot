package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
