package com.quintrix.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "major")
public class Major {

  @Id
  private int ID;

  @Column(name = "Name")
  private String name;

  @OneToOne(mappedBy = "major")
  private Student student;

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

}
