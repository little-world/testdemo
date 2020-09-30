package com.example.demo.system;

import model.Message;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class SystemTest {

  @Test
  public void testCreateReadDelete() {
    RestTemplate restTemplate = new RestTemplate();

    String url = "http://localhost:8080/message";

    Message message = restTemplate.getForObject(url, Message.class);

    Assertions.assertThat(message.getText()).isEqualTo("hallo");
  }

}
