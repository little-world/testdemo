package com.example.demo.unittest;

import com.example.demo.controller.MyController;

import com.example.demo.service.MyService;
import model.Message;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
public class Unittest {

  @MockBean
  MyService myService;

  @Autowired
  MockMvc mockMvc;

  @Test
  public void test() throws Exception {
    Message message = new Message(123, "test123");

    Mockito.when(myService.sendData()).thenReturn(message);

    mockMvc.perform(get("/message"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.text", Matchers.is("test123")));
  }

}
