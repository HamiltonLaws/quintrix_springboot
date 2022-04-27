package com.quintrix.springboot.models;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "course")
public class Course {

  @Id
  @GeneratedValue
  private int ID;

  @Column(name = "Name")
  private String name;

  @Column(name = "CreditHours")
  private int creditHours;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "DepartmentID", nullable = false)
  private Department department;

  @JsonManagedReference
  @OneToMany(mappedBy = "course")
  private Set<Section> sections;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCreditHours() {
    return creditHours;
  }

  public void setCreditHours(int creditHours) {
    this.creditHours = creditHours;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Set<Section> getSections() {
    return sections;
  }

  public void setSections(Set<Section> sections) {
    this.sections = sections;
  }



}
