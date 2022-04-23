package com.quintrix.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "section")
public class Section {


  /*
   * TODO Connect to course and semester and faculty
   */


  @Id
  private int ID;

  @Column(name = "Name")
  private String name;

  @Column(name = "Capacity")
  private int capacity;

  @Column(name = "CourseID")
  private int courseId;

  @Column(name = "SemesterID")
  private int semesterId;

  @Column(name = "TaughtByID")
  private int taughtById;

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

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCourseID() {
    return courseId;
  }

  public void setCourseID(int courseID) {
    courseId = courseID;
  }

  public int getSemesterID() {
    return semesterId;
  }

  public void setSemesterID(int semesterID) {
    semesterId = semesterID;
  }

  public int getTaughtByID() {
    return taughtById;
  }

  public void setTaughtByID(int taughtByID) {
    taughtById = taughtByID;
  }

}
