package com.springbootshare.quickly_start.vo;

public class Hello {

  private String name;
  private String greeting;

  public Hello(String name, String greeting) {
    this.name = name;
    this.greeting = greeting;
  }

  public String getName() {
    return name;
  }

  public String getGreeting() {
    return greeting;
  }
}
