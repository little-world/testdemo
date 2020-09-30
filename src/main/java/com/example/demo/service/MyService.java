package com.example.demo.service;

import model.Message;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  public Message sendData() {
    return new Message(1, "hallo");
  }

}