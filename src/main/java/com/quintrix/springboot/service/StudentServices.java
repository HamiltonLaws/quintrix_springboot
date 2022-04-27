package com.quintrix.springboot.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springboot.models.Registration;
import com.quintrix.springboot.models.Section;
import com.quintrix.springboot.models.Student;
import com.quintrix.springboot.repository.StudentRepository;

@Service
public class StudentServices {
  @Autowired
  StudentRepository repository;

  // @Autowired
  // SectionRepository sectionRepository;

  // @Autowired
  // RegistrationRepository regRepository;

  public List<Student> getStudents() {
    return repository.findAll();
  }

  /*
   * Returns a list of Students found by last name
   */
  public List<Student> getByLastName(String name) {
    return repository.findByLastName(name);
  }

  /*
   * Returns a list of Classes that the student is taking by student id
   */
  public List<String> getClassByID(int id) {
    Student selectedStudent = repository.findById(id).orElse(null);
    Set<Registration> registeredList = selectedStudent.getClasses();
    List<Section> sectionList =
        registeredList.stream().map(c -> c.getSpecificClass()).collect(Collectors.toList());
    return sectionList.stream().map(c -> c.getCourse().getName()).collect(Collectors.toList());

  }

  /*
   * Returns a list of times of classes
   */
  public List<String> getScheduleById(int id) {
    Student selectedStudent = repository.findById(id).orElse(null);
    Set<Registration> registrationList = selectedStudent.getClasses();
    return registrationList.stream().map(c -> c.getSpecificClass().getName())
        .collect(Collectors.toList());
  }


}
