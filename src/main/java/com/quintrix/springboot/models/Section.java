package com.quintrix.springboot.models;

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


@Entity
@Table(name = "section")
public class Section {



  @Id
  private int ID;

  @Column(name = "Name")
  private String name;

  @Column(name = "Capacity")
  private int capacity;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "CourseID", nullable = false)
  private Course course;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "SemesterID", nullable = false)
  private Semester semester;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "TaughtByID", nullable = false)
  private Faculty professor;

  @JsonManagedReference
  @OneToMany(mappedBy = "specificClass")
  private Set<Registration> registered;

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

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public Semester getSemester() {
    return semester;
  }

  public void setSemester(Semester semester) {
    this.semester = semester;
  }

  public Faculty getProfessor() {
    return professor;
  }

  public void setProfessor(Faculty professor) {
    this.professor = professor;
  }

  public Set<Registration> getRegistered() {
    return registered;
  }

  public void setRegistered(Set<Registration> registered) {
    this.registered = registered;
  }



}
