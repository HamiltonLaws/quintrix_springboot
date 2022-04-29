package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
