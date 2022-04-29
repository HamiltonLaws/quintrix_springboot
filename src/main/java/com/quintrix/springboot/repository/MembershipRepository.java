package com.quintrix.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.springboot.models.collage.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Integer> {

}
