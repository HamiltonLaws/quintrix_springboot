package com.quintrix.springboot.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "department")
public class Department {

  @Id
  @GeneratedValue
  private int ID;
  private String Name;

  @OneToOne(mappedBy = "department")
  private Faculty faculty;

  @OneToMany(mappedBy = "department")
  private Set<Course> courses;

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    ID = iD;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }
}
