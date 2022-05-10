package com.quintrix.springboot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SpringbootApplicationTests {

  @Test
  void contextLoads() {}

  @Autowired
  private WebApplicationContext webApplicationContext;

  private MockMvc mockMvc;

  @BeforeEach
  public void setup() {
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testStudent() throws Exception {
    mockMvc.perform(get("/students")).andExpect(status().isOk());
    // .andExpect(content().contentType("application/json;charset=UTF-8"))
    // .andExpect(jsonPath("$.name").value("emp1"))
    // .andExpect(jsonPath("$.designation").value("manager"))
    // .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

  }

  @Test
  public void testMajor() throws Exception {
    mockMvc.perform(get("/majors")).andExpect(status().isOk());
    // .andExpect(content().contentType("application/json;charset=UTF-8"))
    // .andExpect(jsonPath("$.name").value("emp1"))
    // .andExpect(jsonPath("$.designation").value("manager"))
    // .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

  }

  @Test
  public void testAgent() throws Exception {
    mockMvc.perform(get("/agents")).andExpect(status().isOk());
    // .andExpect(content().contentType("application/json;charset=UTF-8"))
    // .andExpect(jsonPath("$.name").value("emp1"))
    // .andExpect(jsonPath("$.designation").value("manager"))
    // .andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));

  }

}
