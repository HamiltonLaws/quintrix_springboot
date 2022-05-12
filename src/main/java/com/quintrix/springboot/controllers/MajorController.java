package com.quintrix.springboot.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.collage.Major;
import com.quintrix.springboot.service.MajorServices;

@RestController
public class MajorController {

  @Autowired
  private MajorServices service;

  private static final Logger logger = LoggerFactory.getLogger(MajorController.class);

  @PostMapping("/addMajor")
  public Major addMajor(@RequestBody Major major) {
    logger.debug("User requests to add a Major {}", major);
    return service.saveMajor(major);
  }

  @PostMapping("/addMajors")
  public List<Major> addmajors(@RequestBody List<Major> majors) {
    logger.debug("User requests to add multipul majors {} ", majors);
    return service.saveMajors(majors);
  }

  @GetMapping("/majors")
  public List<Major> findAllMajors() {
    logger.debug("User requests to display all Majors");
    return service.getMajors();
  }

  @GetMapping("/major/{id}")
  public Major findMajorById(@PathVariable int id) {
    logger.debug("User requests major by id {} ", id);
    return service.getMajorId(id);
  }


  @GetMapping("majorByName/{name}")
  public List<Major> findMajorByName(@PathVariable String name) {
    logger.debug("User request a major with name {}", name);
    return service.getMajorByName(name);
  }


  @PutMapping("/majorUpdate")
  public Major updateMajor(@RequestBody Major major) {
    logger.debug("User requests to update major {}", major);
    return service.updateMajor(major);
  }

  @DeleteMapping("/majorDelete/{id}")
  public String deleteMajor(@PathVariable int id) {
    logger.debug("User requests to delete Major with id {}", id);
    return service.deleteMajor(id);
  }
}

