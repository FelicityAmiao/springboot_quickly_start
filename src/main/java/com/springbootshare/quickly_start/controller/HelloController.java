package com.springbootshare.quickly_start.controller;

import com.springbootshare.quickly_start.vo.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public Hello greeting(@RequestParam String name) {
    return new Hello(name, "Hello " + name + "!");
  }
}
