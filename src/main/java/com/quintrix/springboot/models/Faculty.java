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
@Table(name = "faculty")
public class Faculty {

  @Id
  private int ID;

  @Column(name = "LastName")
  private String lastName;

  @Column(name = "FirstName")
  private String firstName;

  @Column(name = "Email")
  private String email;

  @Column(name = "Salary")
  private BigDecimal salary;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "DepartmentID", referencedColumnName = "ID")
  private Department department;

  // @Column(name = "DepartmentID")
  // private int departmentId;

  @Column(name = "HireDate")
  private LocalDateTime hireDate;

  // public int getDepartmentId() {
  // return departmentId;
  // }

  // public void setDepartmentId(int departmentId) {
  // this.departmentId = departmentId;
  // }

  public LocalDateTime getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDateTime hireDate) {
    this.hireDate = hireDate;
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

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

}
