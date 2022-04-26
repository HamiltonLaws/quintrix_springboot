package com.quintrix.springboot.models;

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

  @ManyToOne
  @JoinColumn(name = "DepartmentID", nullable = true)
  private Department department;


  @Column(name = "HireDate")
  private LocalDateTime hireDate;

  @OneToMany(mappedBy = "professor")
  private Set<Section> teaching;

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

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public LocalDateTime getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDateTime hireDate) {
    this.hireDate = hireDate;
  }

  public Set<Section> getTeaching() {
    return teaching;
  }

  public void setTeaching(Set<Section> teaching) {
    this.teaching = teaching;
  }



}
