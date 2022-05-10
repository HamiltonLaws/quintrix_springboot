package com.quintrix.springboot.service;

import java.util.List;
import com.quintrix.springboot.models.user.User;

public interface UserServices {



  List<User> getAllUsers();

  User saveUser(User user);

}
