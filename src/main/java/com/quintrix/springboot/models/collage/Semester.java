package com.quintrix.springboot.models.collage;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "semester")
public class Semester {

  @Id
  private int ID;
  private String Name;

  @JsonManagedReference
  @OneToMany(mappedBy = "semester")
  private Set<Section> sections;

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

  public Set<Section> getSections() {
    return sections;
  }

  public void setSections(Set<Section> sections) {
    this.sections = sections;
  }



}
