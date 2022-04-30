package com.quintrix.springboot.controllers;

import java.util.List;
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

  @PostMapping("/addMajor")
  public Major addMajor(@RequestBody Major major) {
    return service.saveMajor(major);
  }

  @PostMapping("/addMajors")
  public List<Major> addmajors(@RequestBody List<Major> majors) {
    return service.saveMajors(majors);
  }

  @GetMapping("/majors")
  public List<Major> findAllMajors() {
    return service.getMajors();
  }

  @GetMapping("/major/{id}")
  public Major findMajorById(@PathVariable int id) {
    return service.getMajorId(id);
  }


  @GetMapping("majorByName/{name}")
  public List<Major> findMajorByName(@PathVariable String name) {
    return service.getMajorByName(name);
  }


  @PutMapping("/majorUpdate")
  public Major updateMajor(@RequestBody Major major) {
    return service.updateMajor(major);
  }

  @DeleteMapping("/majorDelete/{id}")
  public String deleteMajor(@PathVariable int id) {
    return service.deleteMajor(id);
  }
}

