package com.quintrix.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springboot.models.agents.Agent;
import com.quintrix.springboot.service.AgentServices;

@RestController
public class AgentController {

  @Autowired
  private AgentServices service;



  @GetMapping("/agents")
  public List<Agent> findAllAgents() {
    return service.getAgents();
  }

  @GetMapping("/agent")
  @ResponseBody
  public List<Agent> getAgentByGenderOrName(
      @RequestParam(name = "gender", required = false) String gender,
      @RequestParam(name = "name", required = false) String name) {
    if (gender != null && name != null) {
      return service.getAgentByNameAndGender(name, gender);
    } else if (name == null) {
      return service.getAgentsByGender(gender);
    } else if (gender == null) {
      return service.getAgentsByName(name);
    } else {
      return null;
    }
  }

  @GetMapping("/agent/{id}")
  @ResponseBody
  public List<Agent> getAgentById(@PathVariable(required = false) Integer id) {
    return service.getAgentById(id);
  }



}
