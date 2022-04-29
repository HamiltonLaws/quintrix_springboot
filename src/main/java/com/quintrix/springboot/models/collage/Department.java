package com.quintrix.springboot.models.collage;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "department")
public class Department {

  @Id
  @GeneratedValue
  private int ID;
  private String Name;

  @JsonManagedReference
  @OneToMany(mappedBy = "department")
  private Set<Faculty> department;

  @JsonManagedReference
  @OneToMany(mappedBy = "department")
  private Set<Course> courses;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public Set<Faculty> getDepartment() {
    return department;
  }

  public void setDepartment(Set<Faculty> department) {
    this.department = department;
  }

  public Set<Course> getCourses() {
    return courses;
  }

  public void setCourses(Set<Course> courses) {
    this.courses = courses;
  }



}
