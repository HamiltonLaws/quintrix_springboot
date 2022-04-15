package com.quintrix.springboot.controllers.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue
  private int ID;
  private String LastName;
  private String FirstName;
  private String Email;
  private char Sex;
  private String DateOfBirth;
  private String EnrolledDate;
  // private int MajorID;
  private Float Scholarship;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public String getFirstName() {
    return FirstName;
  }

  public void setFirstName(String firstName) {
    FirstName = firstName;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public char getSex() {
    return Sex;
  }

  public void setSex(char sex) {
    Sex = sex;
  }

  public String getDateOfBirth() {
    return DateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    DateOfBirth = dateOfBirth;
  }

  public String getEnrolledDate() {
    return EnrolledDate;
  }

  public void setEnrolledDate(String enrolledDate) {
    EnrolledDate = enrolledDate;
  }

  // public int getMajorID() {
  // return MajorID;
  // }

  // public void setMajorID(int majorID) {
  // MajorID = majorID;
  // }

  public Float getScholarship() {
    return Scholarship;
  }

  public void setScholarship(Float scholarship) {
    Scholarship = scholarship;
  }
}
