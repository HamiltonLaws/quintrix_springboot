package com.quintrix.springboot.models;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration {

  @Id
  @GeneratedValue
  private int ID;
  private int StudentID;
  private int SectionID;
  private BigDecimal Grade;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public int getStudentID() {
    return StudentID;
  }

  public void setStudentID(int studentID) {
    StudentID = studentID;
  }

  public int getSectionID() {
    return SectionID;
  }

  public void setSectionID(int sectionID) {
    SectionID = sectionID;
  }

  public BigDecimal getGrade() {
    return Grade;
  }

  public void setGrade(BigDecimal grade) {
    Grade = grade;
  }
}
