package com.quintrix.springboot.service.Impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.quintrix.springboot.models.user.User;
import com.quintrix.springboot.service.UserServices;

@Service
public class UserServicesImpl implements UserServices {

  private static final Logger logger = LoggerFactory.getLogger(UserServices.class);

  @Autowired
  RestTemplate restTemplate;

  @Value("${userService.getUrl}")
  String userServiceGetURL;


  @Override
  public List<User> getAllUsers() {

    ResponseEntity<List<User>> userListResonseEnity = restTemplate.exchange(userServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {});


    if (userListResonseEnity.getStatusCode() == HttpStatus.OK) {
      return userListResonseEnity.getBody();
    } else
      logger.error("Unable to get Users from rest Template");
    return null;
  }

  @Override
  public User saveUser(User user) {
    ResponseEntity<Void> request = restTemplate.postForEntity(userServiceGetURL, user, Void.class);
    if (request.getStatusCode() == HttpStatus.OK) {
      return user;
    }
    logger.error("Unable to post Users to rest Template");
    return null;

  }
}
