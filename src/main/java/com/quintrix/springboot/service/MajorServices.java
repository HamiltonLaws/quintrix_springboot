package com.quintrix.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.models.collage.Major;
import com.quintrix.springboot.repository.MajorRepository;

@Service
public class MajorServices {
  @Autowired
  private MajorRepository repository;


  public Major saveMajor(Major major) {
    return repository.save(major);
  }


  public List<Major> saveMajors(List<Major> major) {
    return repository.saveAll(major);
  }

  public List<Major> getMajors() {
    return repository.findAll();
  }

  public Major getMajorId(int id) {
    return repository.findById(id).orElse(null);
  }

  public List<Major> getMajorByName(String name) {
    return repository.findByName(name);
  }

  public String deleteMajor(int id) {
    repository.deleteById(id);
    return "product removed !! " + id;
  }

  public Major updateMajor(Major major) {
    Major existingMajor = repository.findById(major.getID()).orElse(null);
    existingMajor.setName(major.getName());
    return repository.save(existingMajor);
  }



}
