package com.quintrix.springboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.quintrix.springboot.models.agents.Agent;


@RestController
public class HelloController {

  @Autowired
  RestTemplate restTemplate;

  @GetMapping("/")
  public String index() {
    // String userStr =
    // restTemplate.getForObject("https://gorest.co.in/public/v2/users", String.class);

    return "Hello";
  }

  /*
   * Move agents to own implementation and service
   */

  @GetMapping("/agents")
  public List<Agent> getAgents() {

    ResponseEntity<List<Agent>> agentsListResonseEnity =
        restTemplate.exchange("https://gorest.co.in/public/v2/users", HttpMethod.GET, null,
            new ParameterizedTypeReference<List<Agent>>() {});

    if (agentsListResonseEnity.getStatusCode() == HttpStatus.OK) {
      return agentsListResonseEnity.getBody();
    } else {
      return null;
    }

  }

}
