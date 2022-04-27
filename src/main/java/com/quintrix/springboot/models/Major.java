package com.quintrix.springboot.models;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*
 * TODO Took out the setters and getter for student set because an endless loop would form looking
 * into issues to solve
 */

@Entity
@Table(name = "major")
public class Major {

  @Id
  @Column(name = "ID")
  private int id;

  @Column(name = "Name")
  private String name;

  @OneToMany(mappedBy = "major")
  private Set<Student> students;

  public int getID() {
    return id;
  }

  public void setID(int iD) {
    id = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



}
