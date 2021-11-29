package com.eomcs.study;

public class StudyApplication {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new StudyApplication().getGreeting());
  }
}
