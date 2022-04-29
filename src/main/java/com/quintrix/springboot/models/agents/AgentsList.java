package com.quintrix.springboot.models.agents;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"agentsList"})
@Generated("jsonschema2pojo")
public class AgentsList {

  @JsonProperty("agentsList")
  private List<Agent> agentsList = null;

  @JsonProperty("agentsList")
  public List<Agent> getAgentsList() {
    return agentsList;
  }

  @JsonProperty("agentsList")
  public void setAgentsList(List<Agent> agentsList) {
    this.agentsList = agentsList;
  }
}
