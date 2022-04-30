package com.quintrix.springboot.service;

import java.util.List;
import com.quintrix.springboot.models.agents.Agent;

public interface AgentServices {

  List<Agent> getAgents();

  List<Agent> getAgentsByGender(String gender);

  List<Agent> getAgentsByName(String name);

  List<Agent> getAgentByNameAndGender(String name, String gender);

  List<Agent> getAgentById(Integer id);

}
