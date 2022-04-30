package com.quintrix.springboot.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.models.collage.Major;
import com.quintrix.springboot.repository.MajorRepository;
import com.quintrix.springboot.service.MajorServices;

@Service
public class MajorServicesImpl implements MajorServices {
  @Autowired
  private MajorRepository repository;



  @Override
  public Major saveMajor(Major major) {
    return repository.save(major);
  }


  @Override
  public List<Major> saveMajors(List<Major> major) {
    return repository.saveAll(major);
  }

  @Override
  public List<Major> getMajors() {
    return repository.findAll();

  }

  @Override
  public Major getMajorId(int id) {
    return repository.findById(id).orElse(null);

  }

  @Override
  public List<Major> getMajorByName(String name) {
    return repository.findByName(name);

  }

  @Override
  public String deleteMajor(int id) {
    repository.deleteById(id);
    return "product removed !! " + id;
  }

  @Override
  public Major updateMajor(Major major) {
    Major existingMajor = repository.findById(major.getID()).orElse(null);
    existingMajor.setName(major.getName());
    return repository.save(existingMajor);
  }



}
