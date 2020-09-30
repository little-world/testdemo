package com.example.demo.controller;


import com.example.demo.service.MyService;
import model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired
  MyService myService;

  @GetMapping("/message")
  public Message send() {
    //valid
    // business logic

    return myService.sendData();
  }
}
