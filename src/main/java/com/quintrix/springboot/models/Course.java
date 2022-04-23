package com.quintrix.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

  // @Column(name = "DepartmentID")
  // private int departmentId;

  @ManyToOne
  @JoinColumn(name = "DepartmentID", nullable = false)
  private Department department;

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

  // public int getDepartmentId() {
  // return departmentId;
  // }

  // public void setDepartmentId(int departmentId) {
  // this.departmentId = departmentId;
  // }
  //


}
