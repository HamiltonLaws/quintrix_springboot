package com.quintrix.springboot.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "membership")
public class Membership {



  /*
   * TODO Connect to student and club
   */

  @Id
  @GeneratedValue
  private int ID;
  private int ClubID;
  // private int StudentID;

  // @ManyToOne
  // @JoinColumn(name = "StudentID", nullable = false)
  // private Student student;

  @Column(name = "DateJoined")
  private LocalDateTime dateJoined;

  public LocalDateTime getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(LocalDateTime dateJoined) {
    this.dateJoined = dateJoined;
  }

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public int getClubID() {
    return ClubID;
  }

  public void setClubID(int clubID) {
    ClubID = clubID;
  }

  // public int getStudentID() {
  // return StudentID;
  // }

  // public void setStudentID(int studentID) {
  // StudentID = studentID;
  // }

}
