package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.controllers.models.Major;

public interface MajorRepository extends JpaRepository<Major, Integer> {
  // Major findByMajor(String major);
}
