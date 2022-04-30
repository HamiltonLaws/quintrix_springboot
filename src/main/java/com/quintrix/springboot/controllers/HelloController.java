package com.quintrix.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


  @GetMapping("/")
  public String index() {
    // String userStr =
    // restTemplate.getForObject("https://gorest.co.in/public/v2/users", String.class);

    return "Hello";
  }



}
