package com.quintrix.springboot.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.user.User;
import com.quintrix.springboot.service.UserServices;

@RestController
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserServices service;

  /*
   * Can post a user and receive all users from quintrix_mongodb when running on port 8081
   */

  @GetMapping("/users")
  public List<User> getUsers() {
    logger.debug("Request for all Users");
    return service.getAllUsers();
  }

  @PostMapping("/users")
  public User saveUser(@RequestBody User user) {
    logger.debug("Request to post {}", user);
    return service.saveUser(user);
  }

}
