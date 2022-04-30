package com.quintrix.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Major;


public interface MajorRepository extends JpaRepository<Major, Integer> {
  List<Major> findByName(String name);

}
