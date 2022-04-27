package com.quintrix.springboot.models;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "registration")
public class Registration {



  @Id
  @GeneratedValue
  private int ID;
  private BigDecimal Grade;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "StudentID", nullable = false)
  private Student student;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "SectionID", nullable = false)
  private Section specificClass;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public BigDecimal getGrade() {
    return Grade;
  }

  public void setGrade(BigDecimal grade) {
    Grade = grade;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Section getSpecificClass() {
    return specificClass;
  }

  public void setSpecificClass(Section specificClass) {
    this.specificClass = specificClass;
  }



}
