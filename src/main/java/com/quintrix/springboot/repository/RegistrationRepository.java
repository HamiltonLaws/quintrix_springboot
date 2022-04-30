package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
