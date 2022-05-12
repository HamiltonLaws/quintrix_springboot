package com.quintrix.springboot.service.Impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.exceptions.MajorNotFoundException;
import com.quintrix.springboot.models.collage.Major;
import com.quintrix.springboot.repository.MajorRepository;
import com.quintrix.springboot.service.MajorServices;

@Service
public class MajorServicesImpl implements MajorServices {

  private static final Logger logger = LoggerFactory.getLogger(MajorServices.class);


  @Autowired
  private MajorRepository repository;

  /*
   * Saves a specific major that is received
   */

  @Override
  public Major saveMajor(Major major) {
    logger.debug("Saving Major {} ", major);
    return repository.save(major);
  }


  /*
   * Saves a specific list of majors that is received
   */
  @Override
  public List<Major> saveMajors(List<Major> major) {
    logger.debug("Saving all majors in list");
    return repository.saveAll(major);
  }

  /*
   * Sends out a list of all Majors
   */
  @Override
  public List<Major> getMajors() {
    List<Major> majorList;
    majorList = repository.findAll();
    if (majorList.isEmpty()) {
      logger.error("No Major in the table list");
      throw new MajorNotFoundException("Major table empty", "Enter in Major information");
    } else {
      logger.debug("Retuning all Majors");
      return majorList;
    }
  }

  /*
   * Returns major with a specific id
   */
  @Override
  public Major getMajorId(int id) {
    Major selectedMajor;
    selectedMajor = repository.findById(id).orElse(null);
    if (selectedMajor == null) {
      logger.error("No Major with ID {}", id);
      throw new MajorNotFoundException("No ID " + id, "Please enter in a valid ID");
    } else {
      logger.debug("Returning Major by ID {}", id);
      return selectedMajor;
    }
  }

  /*
   * Returns all Majors with a specific name
   */
  @Override
  public List<Major> getMajorByName(String name) {
    List<Major> majorList;
    majorList = repository.findByName(name);
    if (majorList.isEmpty()) {
      logger.error("No  Major with Name {}", name);
      throw new MajorNotFoundException("No Major with name " + name,
          "Please enter in a valid Name");
    } else {
      logger.debug("Finding Major by name {}", name);
      return majorList;
    }
  }

  /*
   * Deletes Major with specific id
   */
  @Override
  public String deleteMajor(int id) {
    Major selectedMajor = repository.findById(id).orElse(null);
    if (selectedMajor == null) {
      logger.error("No major with id {}", id);
      throw new MajorNotFoundException("No Major with ID " + id,
          "Please enter in a valid ID to delete record");
    } else {
      repository.deleteById(id);
      logger.debug("Removed major by ID {}", id);
      return "product removed !! " + id;
    }
  }

  /*
   * Updates a Major to the database
   */
  @Override
  public Major updateMajor(Major major) {
    Major existingMajor = repository.findById(major.getID()).orElse(null);
    if (existingMajor == null) {
      logger.error("No major with id {}", major.getID());
      throw new MajorNotFoundException("No Major with ID " + major.getID(),
          "Please enter in a valid Major to Update the record");
    } else {
      existingMajor.setName(major.getName());
      logger.debug("Updated major with ID {}", major.getID());
      return repository.save(existingMajor);
    }
  }



}
