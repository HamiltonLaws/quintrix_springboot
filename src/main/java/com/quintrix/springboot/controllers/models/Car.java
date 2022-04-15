package com.quintrix.springboot.controllers.models;

public class Car {

  Long id;

  String make;

  String modle;

  Integer year;

  public Car(Long i, String make, String modle, Integer year) {
    super();
    this.id = i;
    this.make = make;
    this.modle = modle;
    this.year = year;
  }

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModle() {
    return modle;
  }

  public void setModle(String modle) {
    this.modle = modle;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

}
