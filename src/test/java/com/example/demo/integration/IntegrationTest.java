package com.example.demo.integration;

import com.example.demo.controller.MyController;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTest {

  @Autowired
  MyController myController;

  @Test
  public void contextLoads() {
    Assertions.assertThat(myController.send().getText()).isEqualTo("hallo");
    Assert.assertEquals(myController.send().getText(), "hallo");
    Assert.assertThat(myController.send().getText(), Matchers.is("hallo"));
  }

}
