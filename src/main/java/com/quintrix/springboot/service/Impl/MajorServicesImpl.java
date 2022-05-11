package com.quintrix.springboot.service.Impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.models.collage.Major;
import com.quintrix.springboot.repository.MajorRepository;
import com.quintrix.springboot.service.MajorServices;

@Service
public class MajorServicesImpl implements MajorServices {

  private static final Logger logger = LoggerFactory.getLogger(MajorServices.class);


  @Autowired
  private MajorRepository repository;



  @Override
  public Major saveMajor(Major major) {
    logger.debug("Saving Major {} " + major);
    return repository.save(major);
  }


  @Override
  public List<Major> saveMajors(List<Major> major) {
    logger.debug("Saving all majors in list");
    return repository.saveAll(major);
  }

  @Override
  public List<Major> getMajors() {
    logger.debug("Retuning all Majors");
    return repository.findAll();

  }

  @Override
  public Major getMajorId(int id) {
    logger.debug("Returning Major by ID {}" + id);
    return repository.findById(id).orElse(null);

  }

  @Override
  public List<Major> getMajorByName(String name) {
    logger.debug("Finding Major by name {}" + name);
    return repository.findByName(name);

  }

  @Override
  public String deleteMajor(int id) {
    repository.deleteById(id);
    logger.debug("Removed major by ID {}" + id);
    return "product removed !! " + id;
  }

  @Override
  public Major updateMajor(Major major) {
    Major existingMajor = repository.findById(major.getID()).orElse(null);
    existingMajor.setName(major.getName());
    logger.debug("Updated major with ID {}" + major.getID());
    return repository.save(existingMajor);
  }



}
