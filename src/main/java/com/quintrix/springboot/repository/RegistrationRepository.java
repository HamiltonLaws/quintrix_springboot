package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
