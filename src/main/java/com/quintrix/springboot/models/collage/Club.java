package com.quintrix.springboot.models.collage;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "club")
public class Club {

  @Id
  @GeneratedValue
  private int ID;
  private String Name;

  @JsonManagedReference
  @OneToMany(mappedBy = "club")
  private Set<Membership> members;

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

  public Set<Membership> getMembers() {
    return members;
  }

  public void setMembers(Set<Membership> members) {
    this.members = members;
  }



}
