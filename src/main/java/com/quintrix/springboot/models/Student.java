package com.quintrix.springboot.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

  @Id
  private int ID;

  @Column(name = "LastName")
  private String lastName;

  @Column(name = "FirstName")
  private String firstName;

  @Column(name = "Email")
  private String email;

  @Column(name = "Sex")
  private char sex;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "MajorID", referencedColumnName = "ID")
  private Major major;

  // @Column(name = "MajorID")
  // private int majorId;

  @Column(name = "Scholarship")
  private BigDecimal scholarship;

  @Column(name = "DateOfBirth")
  private LocalDateTime dateOfBirth;

  @Column(name = "EnrolledDate")
  private LocalDateTime enrolledDate;


  // @OneToMany(mappedBy = "student")
  // private Set club;


  public int getID() {
    return ID;
  }

  public LocalDateTime getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public LocalDateTime getEnrolledDate() {
    return enrolledDate;
  }

  public void setEnrolledDate(LocalDateTime enrolledDate) {
    this.enrolledDate = enrolledDate;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  // public int getMajorId() {
  // return majorId;
  // }

  // public void setMajorId(int majorId) {
  // this.majorId = majorId;
  // }

  public BigDecimal getScholarship() {
    return scholarship;
  }

  public void setScholarship(BigDecimal scholarship) {
    this.scholarship = scholarship;
  }

}
