package com.quintrix.springboot.models.collage;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "membership")
public class Membership {



  @Id
  @GeneratedValue
  private int ID;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "ClubID", nullable = false)
  private Club club;


  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "StudentID", nullable = true)
  private Student member;

  @Column(name = "DateJoined")
  private LocalDateTime dateJoined;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public Club getClub() {
    return club;
  }

  public void setClub(Club club) {
    this.club = club;
  }

  public Student getMember() {
    return member;
  }

  public void setMember(Student member) {
    this.member = member;
  }

  public LocalDateTime getDateJoined() {
    return dateJoined;
  }

  public void setDateJoined(LocalDateTime dateJoined) {
    this.dateJoined = dateJoined;
  }



}
