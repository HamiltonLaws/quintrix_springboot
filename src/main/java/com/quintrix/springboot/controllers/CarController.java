package com.quintrix.springboot.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

}
