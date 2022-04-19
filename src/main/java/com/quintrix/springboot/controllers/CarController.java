package com.quintrix.springboot.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.controllers.models.Car;

@RestController
public class CarController {

  List<Car> carsList = new ArrayList<>(Arrays.asList(new Car(1L, "Ford", "SUV", 2021),
      (new Car(2L, "Jeep", "Truck", 2010)), (new Car(3L, "Tyoda", "Buggy", 2015))));



  @RequestMapping(method = RequestMethod.GET, value = "/cars")
  List<Car> getCars() {

    return carsList;
  }

  @RequestMapping(value = "/cars/{id}", method = RequestMethod.GET)
  public List<Car> getCarById(@PathVariable("id") Long id) {
    List<Car> selectedCar;

    selectedCar = carsList.stream().filter(c -> c.getId().equals(id)).collect(Collectors.toList());

    return selectedCar;
  }

  @RequestMapping(value = "/car", method = RequestMethod.GET)
  public List<Car> getCarsModle(@RequestParam("modle") String modle) {
    List<Car> selectedCar;

    selectedCar =
        carsList.stream().filter(c -> c.getModle().equals(modle)).collect(Collectors.toList());

    return selectedCar;
  }

  @RequestMapping(value = "/cars", method = RequestMethod.POST)
  public ResponseEntity<?> newCar(@RequestBody Car car) {

    Car addedCar = car;

    carsList.add(addedCar);

    return new ResponseEntity<>(addedCar, HttpStatus.OK);
  }


}
