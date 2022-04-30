package com.quintrix.springboot.service;

import java.util.List;
import com.quintrix.springboot.models.collage.Major;

public interface MajorServices {

  Major saveMajor(Major major);

  List<Major> saveMajors(List<Major> major);

  List<Major> getMajors();

  Major getMajorId(int id);

  List<Major> getMajorByName(String name);

  String deleteMajor(int id);

  Major updateMajor(Major major);

}
