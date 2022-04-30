package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {

}
