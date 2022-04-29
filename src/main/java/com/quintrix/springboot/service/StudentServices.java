package com.quintrix.springboot.service;

import java.util.List;
import com.quintrix.springboot.models.collage.Student;

public interface StudentServices {



  List<Student> getStudents();

  List<Student> getByLastName(String name);

  List<String> getClassByID(int id);

  List<String> getScheduleById(int id);

}
