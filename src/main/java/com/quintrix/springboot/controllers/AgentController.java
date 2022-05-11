package com.quintrix.springboot.controllers;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private static final Logger logger = LoggerFactory.getLogger(AgentController.class);

  @Autowired
  private AgentServices service;



  @GetMapping("/agents")
  public List<Agent> findAllAgents() {
    logger.debug("Request for all Agents");
    return service.getAgents();
  }

  @GetMapping("/agent")
  @ResponseBody
  public List<Agent> getAgentByGenderOrName(
      @RequestParam(name = "gender", required = false) String gender,
      @RequestParam(name = "name", required = false) String name) {
    if (gender != null && name != null) {
      logger.debug("Request for agent by name and Gender {}", name, gender);
      return service.getAgentByNameAndGender(name, gender);
    } else if (name == null) {
      logger.debug("Request for agent by gender  {}", gender);
      return service.getAgentsByGender(gender);
    } else if (gender == null) {
      logger.debug("Request for agent by name {}", name);
      return service.getAgentsByName(name);
    } else {
      logger.error("User unable to make request");
      return null;
    }
  }

  @GetMapping("/agent/{id}")
  @ResponseBody
  public List<Agent> getAgentById(@PathVariable(required = false) Integer id) {
    logger.debug("Request for agent by id {}", id);
    return service.getAgentById(id);
  }



}
