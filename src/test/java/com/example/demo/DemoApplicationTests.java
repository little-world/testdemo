package com.example.demo;

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
public class DemoApplicationTests {

  @Autowired
  MyController myController;

  @Test
  public void contextLoads() {

    Assertions.assertThat(myController).isNotNull();
    Assert.assertNotNull(myController);
    Assert.assertThat(myController, Matchers.notNullValue());
  }

}
