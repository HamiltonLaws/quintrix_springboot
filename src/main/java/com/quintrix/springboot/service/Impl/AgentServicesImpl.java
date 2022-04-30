package com.quintrix.springboot.service.Impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.quintrix.springboot.models.agents.Agent;
import com.quintrix.springboot.service.AgentServices;

@Service
public class AgentServicesImpl implements AgentServices {

  @Autowired
  RestTemplate restTemplate;

  @Value("${agentService.getUrl}")
  String agentServiceGetURL;


  /*
   * Returns a list of all agents
   */
  @Override
  public List<Agent> getAgents() {
    ResponseEntity<List<Agent>> agentsListResonseEnity = restTemplate.exchange(agentServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      return agentsListResonseEnity.getBody();
    } else {
      return null;
    }

  }

  /*
   * Returns a list of agents by gender
   */
  @Override
  public List<Agent> getAgentsByGender(String gender) {
    List<Agent> agentList;
    List<Agent> nameList;
    ResponseEntity<List<Agent>> agentsListResonseEnity = restTemplate.exchange(agentServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      agentList = agentsListResonseEnity.getBody();
      nameList =
          agentList.stream().filter(c -> c.getGender().equals(gender)).collect(Collectors.toList());
      return nameList;
    } else {
      return null;
    }
  }

  /*
   * Returns a list of agents by name
   */
  @Override
  public List<Agent> getAgentsByName(String name) {
    List<Agent> agentList;
    List<Agent> nameList;
    ResponseEntity<List<Agent>> agentsListResonseEnity = restTemplate.exchange(agentServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      agentList = agentsListResonseEnity.getBody();
      nameList =
          agentList.stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList());
      return nameList;
    } else {
      return null;
    }
  }

  /*
   * Returns a list of agents by gender and name
   */
  @Override
  public List<Agent> getAgentByNameAndGender(String name, String gender) {
    List<Agent> agentList;
    List<Agent> nameList;
    List<Agent> genderList;
    ResponseEntity<List<Agent>> agentsListResonseEnity = restTemplate.exchange(agentServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      agentList = agentsListResonseEnity.getBody();
      nameList =
          agentList.stream().filter(c -> c.getName().equals(name)).collect(Collectors.toList());
      genderList =
          agentList.stream().filter(c -> c.getGender().equals(gender)).collect(Collectors.toList());
      genderList.retainAll(nameList);
      return genderList;
    } else {
      return null;
    }
  }

  /*
   * Returns a list of agents by id
   */

  @Override
  public List<Agent> getAgentById(Integer id) {
    List<Agent> agentList;
    List<Agent> idList;
    ResponseEntity<List<Agent>> agentsListResonseEnity = restTemplate.exchange(agentServiceGetURL,
        HttpMethod.GET, null, new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      agentList = agentsListResonseEnity.getBody();
      idList = agentList.stream().filter(c -> c.getId().equals(id)).collect(Collectors.toList());
      if (idList.isEmpty()) {
        throw new IllegalStateException("invalidID");
      } else {
        return idList;
      }
    } else {
      throw new IllegalStateException("invalidID");
    }
  }
}
