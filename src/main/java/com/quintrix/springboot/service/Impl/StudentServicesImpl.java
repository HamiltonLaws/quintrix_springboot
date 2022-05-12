package com.quintrix.springboot.service.Impl;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.exceptions.StudentNotFoundException;
import com.quintrix.springboot.models.collage.Registration;
import com.quintrix.springboot.models.collage.Section;
import com.quintrix.springboot.models.collage.Student;
import com.quintrix.springboot.repository.StudentRepository;
import com.quintrix.springboot.service.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices {

  private static final Logger logger = LoggerFactory.getLogger(StudentServices.class);


  @Autowired
  StudentRepository repository;



  @Override
  public List<Student> getStudents() {
    List<Student> studentList;
    studentList = repository.findAll();
    if (studentList.isEmpty()) {
      logger.error("No Students in repository");
      throw new StudentNotFoundException("No students in list", "please add studetns to list");
    } else {
      logger.debug("Returning all of the students on file");
      return studentList;
    }
  }

  /*
   * Returns a list of Students found by last name
   */
  @Override
  public List<Student> getByLastName(String name) {
    List<Student> studentList;
    studentList = repository.findByLastName(name);
    if (studentList.isEmpty()) {
      logger.error("No students with last name {}", name);
      throw new StudentNotFoundException("Last Name not found " + name,
          "Please serch for a vailid Last Name");
    } else {
      logger.debug("Returning all studnts with Last name {}", name);
      return studentList;
    }
  }

  /*
   * Returns a list of Classes that the student is taking by student id
   */
  @Override
  public List<String> getClassByID(int id) {
    Student selectedStudent = repository.findById(id).orElse(null);
    Set<Registration> registeredList = selectedStudent.getClasses();
    List<Section> sectionList =
        registeredList.stream().map(c -> c.getSpecificClass()).collect(Collectors.toList());

    logger.debug("Retuning students classed by listed id {} ", id);
    return sectionList.stream().map(c -> c.getCourse().getName()).collect(Collectors.toList());


  }

  /*
   * Returns a list of times of classes
   */
  @Override
  public List<String> getScheduleById(int id) {
    Student selectedStudent = repository.findById(id).orElse(null);
    Set<Registration> registrationList = selectedStudent.getClasses();
    logger.debug("Retuning the students schedule by ID {} ", id);
    return registrationList.stream().map(c -> c.getSpecificClass().getName())
        .collect(Collectors.toList());

  }


}
