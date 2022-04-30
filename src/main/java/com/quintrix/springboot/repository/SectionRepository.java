package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Section;

public interface SectionRepository extends JpaRepository<Section, Integer> {

}
