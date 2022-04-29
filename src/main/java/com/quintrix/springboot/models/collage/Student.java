package com.quintrix.springboot.models.collage;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;



/*
 * TODO Took out the setters and getter for Registration and Membership set because an endless loop
 * would form looking into issues to solve
 */

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

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "MajorID", nullable = true)
  private Major major;


  @Column(name = "Scholarship")
  private BigDecimal scholarship;

  @Column(name = "DateOfBirth")
  private LocalDateTime dateOfBirth;

  @Column(name = "EnrolledDate")
  private LocalDateTime enrolledDate;

  @JsonManagedReference
  @OneToMany(mappedBy = "member")
  private Set<Membership> clubs;

  @JsonManagedReference
  @OneToMany(mappedBy = "student")
  private Set<Registration> classes;

  public Set<Membership> getClubs() {
    return clubs;
  }

  public void setClubs(Set<Membership> clubs) {
    this.clubs = clubs;
  }

  public Set<Registration> getClasses() {
    return classes;
  }

  public void setClasses(Set<Registration> classes) {
    this.classes = classes;
  }

  public int getID() {
    return ID;
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

  public Major getMajor() {
    return major;
  }

  public void setMajor(Major major) {
    this.major = major;
  }

  public BigDecimal getScholarship() {
    return scholarship;
  }

  public void setScholarship(BigDecimal scholarship) {
    this.scholarship = scholarship;
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



}
